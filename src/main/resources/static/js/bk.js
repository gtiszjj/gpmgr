/**
 * Created by GIS on 2022/2/12.
 */
function loadBk(){
    var dom = document.getElementById("container");
    var myChart = echarts.init(dom);
    var app = {};
    var option;

    // x轴是日期、y轴是排名值

    // 请求接口
    var bkData;
    var seriesList = [];
    var xDataList = [];
    var bkAjax = $.ajax({
        url: '/bk/getBkInfo',
        type: 'GET',
        xhrFields: {
            withCredentials: true
        },
        crossDomain: true,    // ajax请求的时候开启跨域请求发送cookie，否则域名访问时，无法获取session
        success: function (resultdata) {
            bkData = resultdata;
        },
        error: function (e) {
        }
    });
    $.when(bkAjax).done(function () {
        var bkDataJson = JSON.parse(bkData);
        var bkmcList = [];
        // 获取年份
        for(i = 0; i < bkDataJson.length; i++){
            // 获取日期
            var tmpTJRQ = bkDataJson[i].tjrq;
            if (xDataList.indexOf(tmpTJRQ) < 0){
                xDataList.push(tmpTJRQ);
            }
            // 获取题材
            var tmpBKMC = bkDataJson[i].bkmc;
            if (bkmcList.indexOf(tmpBKMC) < 0){
                bkmcList.push(tmpBKMC);
            }
        }

        // 构建echarts图标的series集合
        // 暂时先低效的实现一样，后面统一放到后端去
        for(i = 0; i < bkmcList.length; i++) {
            var tmpBKMC = bkmcList[i];
            var tmpNewArr = [];
            // 查找这个题材所有的数据
            for(j = 0; j < bkDataJson.length; j++){
                if (bkDataJson[j].bkmc === tmpBKMC){
                    tmpNewArr.push(bkDataJson[j].xh);
                }
            }
            // 增加一条线，一类题材
            seriesList.push({
                data: tmpNewArr,
                type: 'line'
            })
        }

        console.log(seriesList.length)
        option = {
            xAxis: {
                type: 'category',
                data: xDataList
            },
            yAxis: {
                type: 'value'
            },
            series: seriesList
        };

        if (option && typeof option === 'object') {
            myChart.setOption(option);
        }
    })
}

loadBk();
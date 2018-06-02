package com.annn;

import lombok.Data;

import java.util.List;
public class Result {
    @Override
    public String toString() {
        return "Result{" +
                "requestId=" + requestId +
                ", resubmitToken=" + resubmitToken +
                ", msg=" + msg +
                ", success=" + success +
                ", content=" + content +
                ", code=" + code +
                '}';
    }

    /**
     * requestId : null
     * resubmitToken : null
     * msg : null
     * success : true
     * content : {"pageNo":1,"pageSize":15,"hrInfoMap":{"4644597":{"userId":10900941,"positionName":"行政 人事 总助 企划","phone":null,"receiveEmail":null,"realName":"高雪","portrait":"i/image3/M00/53/79/CgpOIFsM72KAVmCdAAEID6zCnVY916.jpg","userLevel":"G1","canTalk":true},"3516782":{"userId":8753619,"positionName":"hr","phone":null,"receiveEmail":null,"realName":"thinkda","portrait":null,"userLevel":"G1","canTalk":true},"1461073":{"userId":3479300,"positionName":"经理","phone":null,"receiveEmail":null,"realName":"ryan","portrait":"i/image/M00/22/5D/CgqKkVcUpjyAVS8LAAQUlz9Zptg125.jpg","userLevel":"G1","canTalk":true},"4654406":{"userId":10540599,"positionName":"招聘专员","phone":null,"receiveEmail":null,"realName":"玉萃","portrait":"i/image2/M00/44/77/CgotOVrMUKCAaENmAABXAtWX9DE373.jpg","userLevel":"G1","canTalk":true},"4657574":{"userId":6915040,"positionName":"人事主管-大连","phone":null,"receiveEmail":null,"realName":"wanghaifei","portrait":null,"userLevel":"G1","canTalk":true},"4243410":{"userId":1731102,"positionName":"","phone":null,"receiveEmail":null,"realName":"人事","portrait":"i/image/M00/37/F5/CgpEMllCExyALHFrAAAJW5r_-R0153.gif","userLevel":"G1","canTalk":true},"4198599":{"userId":10006272,"positionName":"人事","phone":null,"receiveEmail":null,"realName":"谢莹莹","portrait":"i/image3/M00/27/03/Cgq2xlqZC9iALlSQAADLc93M0Io374.jpg","userLevel":"G1","canTalk":true},"4638127":{"userId":7418413,"positionName":"","phone":null,"receiveEmail":null,"realName":"amy.jiang","portrait":null,"userLevel":"G1","canTalk":true},"4555370":{"userId":6087052,"positionName":"招聘经理","phone":null,"receiveEmail":null,"realName":"TinaTian","portrait":"i/image/M00/8C/DA/CgpFT1r1DiiARhpYAAAdQL0kvgs647.png","userLevel":"G1","canTalk":true},"4122553":{"userId":9841779,"positionName":"hr","phone":null,"receiveEmail":null,"realName":"刘明江","portrait":"i/image3/M00/1C/43/Cgq2xlqEHGGAV6yeAAAyLIW_X3I890.png","userLevel":"G1","canTalk":true},"4601046":{"userId":10781804,"positionName":"大连HR","phone":null,"receiveEmail":null,"realName":"西陆森（大连）科技有限公司","portrait":"i/image2/M00/4D/0E/CgoB5lr7qIyAN1F1AAL02btgTFE533.jpg","userLevel":"G1","canTalk":true},"1279890":{"userId":775602,"positionName":"招聘主管","phone":null,"receiveEmail":null,"realName":"晓佳","portrait":null,"userLevel":"G1","canTalk":true},"4528182":{"userId":2047702,"positionName":"HR","phone":null,"receiveEmail":null,"realName":"Amber","portrait":null,"userLevel":"G1","canTalk":true},"4210846":{"userId":4610646,"positionName":"HR","phone":null,"receiveEmail":null,"realName":"孙妍","portrait":"i/image/M00/17/5A/Cgp3O1bxWLyAfjomAABToeghpRA35.jpeg","userLevel":"G1","canTalk":true},"4540283":{"userId":6504110,"positionName":"招聘主管","phone":null,"receiveEmail":null,"realName":"B-31855","portrait":"i/image3/M00/23/58/CgpOIFqVa4CAIJPzAAUJflazBNs937.jpg","userLevel":"G1","canTalk":true}},"positionResult":{"totalCount":107,"queryAnalysisInfo":{"positionName":"java","jobNature":null,"companyName":null,"industryName":null,"usefulCompany":false},"strategyProperty":{"name":"dm-csearch-useUserAllInterest","id":1},"hiTags":null,"locationInfo":{"city":"大连","district":null,"queryByGisCode":false,"businessZone":null,"locationCode":null,"isAllhotBusinessZone":false},"resultSize":15,"hotLabels":null,"result":[{"companyId":142626,"positionName":"JAVA软件工程师","workYear":"应届毕业生","education":"本科","jobNature":"全职","positionId":4638127,"companyShortName":"CLPS","createTime":"2018-05-28 16:54:54","score":0,"city":"大连","salary":"2k-3k","approve":1,"positionAdvantage":"福利待遇好,提可转正,带薪年假","financeStage":"未融资","industryField":"数据服务,金融","companySize":"500-2000人","companyLabelList":["专项奖金","带薪年假","定期体检","交通补助"],"publisherId":7418413,"district":"高新园区","companyLogo":"i/image/M00/4E/BD/Cgp3O1esORGAO1-rAAAIJJwGyjw584.png","positionLables":["实习"],"industryLables":[],"businessZones":["七贤岭"],"longitude":"121.513373","latitude":"38.847339","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"上海华钦信息科技股份有限公司","imState":"disabled","lastLogin":1527760949000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":1,"subwayline":"1号线","stationname":"河口","linestaion":"1号线_河口","formatCreateTime":"3天前发布"},{"companyId":53260,"positionName":"Java工程师","workYear":"不限","education":"大专","jobNature":"全职","positionId":4657574,"companyShortName":"桔子分期","createTime":"2018-05-31 14:37:40","score":0,"city":"大连","salary":"8k-12k","approve":1,"positionAdvantage":"五险一金,岗位晋升,绩效奖金,节日福利","financeStage":"A轮","industryField":"电子商务,金融","companySize":"150-500人","companyLabelList":["节日礼物","股票期权","绩效奖金","扁平管理"],"publisherId":6915040,"district":"高新园区","companyLogo":"i/image3/M00/4C/56/Cgq2xlrezSiAMV5LAAA-7l1x1BQ432.png","positionLables":["支付","电商","数据库","j2ee","第三方支付"],"industryLables":["支付","电商","数据库","j2ee","第三方支付"],"businessZones":["凌水","海事大学"],"longitude":"121.532257","latitude":"38.86512","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"北京桔子分期电子商务有限公司","imState":"disabled","lastLogin":1527757091000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"14:37发布"},{"companyId":40112,"positionName":"java开发","workYear":"1-3年","education":"本科","jobNature":"全职","positionId":4555370,"companyShortName":"华宇","createTime":"2018-05-29 14:03:50","score":0,"city":"大连","salary":"7k-14k","approve":1,"positionAdvantage":"超长年休假,股票期权,年终分红,免费班车","financeStage":"上市公司","industryField":"数据服务","companySize":"500-2000人","companyLabelList":["技能培训","节日礼物","绩效奖金","年度旅游"],"publisherId":6087052,"district":"甘井子区","companyLogo":"i/image/M00/50/F9/CgqKkVe1iJiAbjunAACnF_gGFG8445.png","positionLables":["MySQL","oracle"],"industryLables":[],"businessZones":null,"longitude":"0.0","latitude":"0.0","hitags":null,"resumeProcessRate":61,"resumeProcessDay":1,"companyFullName":"华宇（大连）信息服务有限公司","imState":"today","lastLogin":1527754763000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2天前发布"},{"companyId":71956,"positionName":"Java软件工程师","workYear":"1-3年","education":"大专","jobNature":"全职","positionId":4243410,"companyShortName":"大连盈科","createTime":"2018-05-28 08:54:11","score":0,"city":"大连","salary":"3k-6k","approve":1,"positionAdvantage":"五险,公积金,双休,不加班","financeStage":"不需要融资","industryField":"移动互联网,电子商务","companySize":"15-50人","companyLabelList":["绩效奖金","岗位晋升","五险一金"],"publisherId":1731102,"district":"高新园区","companyLogo":"image1/M00/28/C7/CgYXBlVivjCAWkTDAABAiY-aX74806.png","positionLables":["中级","软件开发","MySQL","j2ee"],"industryLables":[],"businessZones":["凌水","海事大学"],"longitude":"121.530234","latitude":"38.862692","hitags":null,"resumeProcessRate":100,"resumeProcessDay":1,"companyFullName":"大连盈科世纪技术开发有限公司","imState":"today","lastLogin":1527753012000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"3天前发布"},{"companyId":16831,"positionName":"java开发工程师","workYear":"不限","education":"本科","jobNature":"全职","positionId":4540283,"companyShortName":"武汉佰钧成技术有限公司","createTime":"2018-05-30 21:28:10","score":0,"city":"大连","salary":"12k-18k","approve":1,"positionAdvantage":"六险一金,带薪年假,弹性工作,免费体检","financeStage":"不需要融资","industryField":"移动互联网","companySize":"2000人以上","companyLabelList":["带薪年假","计算机软件","管理规范","定期体检"],"publisherId":6504110,"district":"高新园区","companyLogo":"i/image/M00/02/AB/CgqKkVaXX_6AaLKaAAAX52Kvjjg750.jpg","positionLables":["脚本","python"],"industryLables":[],"businessZones":["凌水","海事大学"],"longitude":"121.52285","latitude":"38.864996","hitags":["免费体检","6险1金"],"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"武汉佰钧成技术有限责任公司","imState":"today","lastLogin":1527694573000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"1天前发布"},{"companyId":362398,"positionName":"Java开发工程师","workYear":"1-3年","education":"不限","jobNature":"全职","positionId":4654406,"companyShortName":"锐英科技","createTime":"2018-05-30 23:51:04","score":0,"city":"大连","salary":"6K-12K","approve":0,"positionAdvantage":"有五险一金","financeStage":"未融资","industryField":"其他","companySize":"15-50人","companyLabelList":["\"\""],"publisherId":10540599,"district":"高新园区","companyLogo":"i/image3/M00/4A/8F/Cgq2xlrVrq-ATivYAAtYVkH2RM4101.jpg","positionLables":["高级","中级","初级"],"industryLables":[],"businessZones":null,"longitude":"121.526112","latitude":"38.857043","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连锐英科技有限公司","imState":"today","lastLogin":1527765056000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"1天前发布"},{"companyId":272648,"positionName":"对日java开发软件工程师","workYear":"3-5年","education":"大专","jobNature":"全职","positionId":4198599,"companyShortName":"大连维思创新科技","createTime":"2018-05-06 18:18:31","score":0,"city":"大连","salary":"3K-5K","approve":0,"positionAdvantage":"1、五险一金2、员工旅游3、交通补助","financeStage":"未融资","industryField":"移动互联网","companySize":"15-50人","companyLabelList":[],"publisherId":10006272,"district":"高新园区","companyLogo":"i/image3/M00/1C/F4/Cgq2xlqNF36AKfwDAAACt5yH3HM035.png","positionLables":["架构师","软件开发"],"industryLables":[],"businessZones":["火炬路"],"longitude":null,"latitude":null,"hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连维思创新科技有限公司","imState":"today","lastLogin":1527765290000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2018-05-06"},{"companyId":80771,"positionName":"高级Java工程师","workYear":"不限","education":"不限","jobNature":"全职","positionId":4528182,"companyShortName":"乐天创研","createTime":"2018-05-31 09:07:52","score":0,"city":"大连","salary":"20k-30k","approve":1,"positionAdvantage":"出国培训,跨境团队,年终奖金,赞助巴萨","financeStage":"上市公司","industryField":"电子商务,旅游","companySize":"2000人以上","companyLabelList":["技能培训","节日礼物","带薪年假","绩效奖金"],"publisherId":2047702,"district":"高新园区","companyLogo":"image1/M00/34/31/Cgo8PFWWNh2AHeOqAAATQPbTv9Q118.jpg?cc=0.08387353224679828","positionLables":["电商","软件开发","大数据"],"industryLables":["电商","软件开发","大数据"],"businessZones":["七贤岭"],"longitude":"121.51093","latitude":"38.847009","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"乐天创研（北京）科技有限公司","imState":"today","lastLogin":1527727443000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"12号线","stationname":"蔡大岭","linestaion":"1号线_河口;12号线_蔡大岭","formatCreateTime":"09:07发布"},{"companyId":109508,"positionName":"Java","workYear":"1-3年","education":"本科","jobNature":"全职","positionId":1461073,"companyShortName":"心水科技","createTime":"2018-05-21 14:43:15","score":0,"city":"大连","salary":"4k-8k","approve":0,"positionAdvantage":"宽松、灵活的工作环境（弹性上下班时间）","financeStage":"未融资","industryField":"电子商务,企业服务","companySize":"15-50人","companyLabelList":[],"publisherId":3479300,"district":"高新园区","companyLogo":"i/image/M00/03/96/Cgp3O1bBfLCAK56EAADJC-td87w981.png","positionLables":[],"industryLables":[],"businessZones":["火炬路","七贤岭","海事大学"],"longitude":"121.516647","latitude":"38.861778","hitags":null,"resumeProcessRate":100,"resumeProcessDay":4,"companyFullName":"大连心水科技有限公司","imState":"today","lastLogin":1527747557000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_七贤岭","formatCreateTime":"2018-05-21"},{"companyId":41758,"positionName":"高级Java开发工程师（SE）","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":1279890,"companyShortName":"英赛信息","createTime":"2018-05-31 09:58:47","score":0,"city":"大连","salary":"7k-12k","approve":0,"positionAdvantage":"良好的办公环境，优厚的福利待遇。","financeStage":"未融资","industryField":"企业服务","companySize":"15-50人","companyLabelList":["五险一金","办公环境良好","工作氛围融洽"],"publisherId":775602,"district":"高新园区","companyLogo":"i/image/M00/00/C8/Cgp3O1ZVeQeAUPNXAAAiojha0VY696.png","positionLables":["web","Mybatis","spring","jquery"],"industryLables":[],"businessZones":["火炬路","黄浦路","七贤岭"],"longitude":"121.52634044","latitude":"38.85970974","hitags":null,"resumeProcessRate":50,"resumeProcessDay":1,"companyFullName":"信义德信息技术服务（大连）有限公司","imState":"today","lastLogin":1527731866000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"技术","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"09:58发布"},{"companyId":392109,"positionName":"Java工程师","workYear":"3-5年","education":"大专","jobNature":"全职","positionId":4644597,"companyShortName":"贝莱科技","createTime":"2018-05-29 15:53:30","score":0,"city":"大连","salary":"10k-12k","approve":0,"positionAdvantage":"五险一金,带薪年假,周末双休,年底奖金","financeStage":"不需要融资","industryField":"移动互联网","companySize":"15-50人","companyLabelList":["\"\""],"publisherId":10900941,"district":"甘井子区","companyLogo":"i/image/M00/93/FA/CgpEMlsM-TeAcbMnAAAfYNS9bwE702.jpg","positionLables":["web","python"],"industryLables":[],"businessZones":["海事大学","凌水","火炬路"],"longitude":"121.530234","latitude":"38.862692","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"贝莱网络科技（大连）有限公司","imState":"today","lastLogin":1527749771000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"2天前发布"},{"companyId":369366,"positionName":"java","workYear":"1年以下","education":"大专","jobNature":"全职","positionId":4601046,"companyShortName":"SEA","createTime":"2018-05-21 15:03:54","score":0,"city":"大连","salary":"3K-5K","approve":0,"positionAdvantage":"正规公司，项目稳定。五险一金，周末双休。","financeStage":"未融资","industryField":"数据服务 企业服务","companySize":"50-150人","companyLabelList":["\"\""],"publisherId":10781804,"district":"中山区","companyLogo":"i/image2/M00/47/6F/CgoB5lrZVRSAemtOAABCPyn4BUI773.png","positionLables":["web","Javascript","CSS"],"industryLables":[],"businessZones":["中山广场"],"longitude":"121.644927","latitude":"38.918574","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"西陆森（大连）科技有限公司","imState":"today","lastLogin":1527750075000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"前端开发/移动开发","isSchoolJob":0,"subwayline":"九里线","stationname":"青泥洼桥","linestaion":"2号线_青泥洼桥;2号线_友好广场;2号线_中山广场;九里线_大连站","formatCreateTime":"2018-05-21"},{"companyId":80815,"positionName":"高级Java开发（信访）","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":4210846,"companyShortName":"北大软件","createTime":"2018-05-31 13:59:08","score":0,"city":"大连","salary":"6k-12k","approve":1,"positionAdvantage":"五险一金,定期体检,专业培训,餐饮补贴","financeStage":"未融资","industryField":"移动互联网,电子商务","companySize":"500-2000人","companyLabelList":["节日礼物","带薪年假","绩效奖金","年度旅游"],"publisherId":4610646,"district":"高新园区","companyLogo":"i/image3/M00/24/57/Cgq2xlqWZeWATv4qAAAQiql6bg8208.png","positionLables":["软件开发","大数据","web"],"industryLables":[],"businessZones":["七贤岭"],"longitude":"121.523498","latitude":"38.860909","hitags":null,"resumeProcessRate":5,"resumeProcessDay":1,"companyFullName":"北京北大软件工程股份有限公司","imState":"today","lastLogin":1527747976000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"13:59发布"},{"companyId":322535,"positionName":"对日java","workYear":"不限","education":"不限","jobNature":"全职","positionId":4122553,"companyShortName":"华小讯","createTime":"2018-05-29 20:21:34","score":0,"city":"大连","salary":"15K-30K","approve":0,"positionAdvantage":"有机会去日本出差","financeStage":"未融资","industryField":"移动互联网","companySize":"150-500人","companyLabelList":["\"\""],"publisherId":9841779,"district":"西岗区","companyLogo":"i/image3/M00/22/44/CgpOIFqUyDuAHZ3oAAAl7fd-Jo4612.png","positionLables":["后端开发","PHP","C/C++","C#/.NET","Python"],"industryLables":[],"businessZones":null,"longitude":"0.0","latitude":"0.0","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连华小讯科技有限公司","imState":"today","lastLogin":1527749027000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2天前发布"},{"companyId":250166,"positionName":"Java软件工程师","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":3516782,"companyShortName":"大连信科达科技","createTime":"2018-05-29 09:56:20","score":0,"city":"大连","salary":"8k-12k","approve":0,"positionAdvantage":"技术挑战","financeStage":"不需要融资","industryField":"其他,移动互联网","companySize":"少于15人","companyLabelList":[],"publisherId":8753619,"district":"沙河口区","companyLogo":"i/image/M00/64/DB/CgpEMlmaxjqAfL4WAAAMrd66L4w503.jpg","positionLables":["软件开发","前端","后端"],"industryLables":[],"businessZones":["星海广场"],"longitude":"121.591132","latitude":"38.889866","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连信科达科技有限公司","imState":"today","lastLogin":1527736149000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"星海广场","linestaion":"1号线_富国街;1号线_会展中心;1号线_星海广场","formatCreateTime":"2天前发布"}]}}
     * code : 0
     */

    private Object requestId;
    private Object resubmitToken;
    private Object msg;
    private boolean success;
    private ContentBean content;
    private int code;

    public Object getRequestId() {
        return requestId;
    }

    public void setRequestId(Object requestId) {
        this.requestId = requestId;
    }

    public Object getResubmitToken() {
        return resubmitToken;
    }

    public void setResubmitToken(Object resubmitToken) {
        this.resubmitToken = resubmitToken;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class ContentBean {
        @Override
        public String toString() {
            return "ContentBean{" +
                    "pageNo=" + pageNo +
                    ", pageSize=" + pageSize +
                    ", hrInfoMap=" + hrInfoMap +
                    ", positionResult=" + positionResult +
                    '}';
        }

        /**
         * pageNo : 1
         * pageSize : 15
         * hrInfoMap : {"4644597":{"userId":10900941,"positionName":"行政 人事 总助 企划","phone":null,"receiveEmail":null,"realName":"高雪","portrait":"i/image3/M00/53/79/CgpOIFsM72KAVmCdAAEID6zCnVY916.jpg","userLevel":"G1","canTalk":true},"3516782":{"userId":8753619,"positionName":"hr","phone":null,"receiveEmail":null,"realName":"thinkda","portrait":null,"userLevel":"G1","canTalk":true},"1461073":{"userId":3479300,"positionName":"经理","phone":null,"receiveEmail":null,"realName":"ryan","portrait":"i/image/M00/22/5D/CgqKkVcUpjyAVS8LAAQUlz9Zptg125.jpg","userLevel":"G1","canTalk":true},"4654406":{"userId":10540599,"positionName":"招聘专员","phone":null,"receiveEmail":null,"realName":"玉萃","portrait":"i/image2/M00/44/77/CgotOVrMUKCAaENmAABXAtWX9DE373.jpg","userLevel":"G1","canTalk":true},"4657574":{"userId":6915040,"positionName":"人事主管-大连","phone":null,"receiveEmail":null,"realName":"wanghaifei","portrait":null,"userLevel":"G1","canTalk":true},"4243410":{"userId":1731102,"positionName":"","phone":null,"receiveEmail":null,"realName":"人事","portrait":"i/image/M00/37/F5/CgpEMllCExyALHFrAAAJW5r_-R0153.gif","userLevel":"G1","canTalk":true},"4198599":{"userId":10006272,"positionName":"人事","phone":null,"receiveEmail":null,"realName":"谢莹莹","portrait":"i/image3/M00/27/03/Cgq2xlqZC9iALlSQAADLc93M0Io374.jpg","userLevel":"G1","canTalk":true},"4638127":{"userId":7418413,"positionName":"","phone":null,"receiveEmail":null,"realName":"amy.jiang","portrait":null,"userLevel":"G1","canTalk":true},"4555370":{"userId":6087052,"positionName":"招聘经理","phone":null,"receiveEmail":null,"realName":"TinaTian","portrait":"i/image/M00/8C/DA/CgpFT1r1DiiARhpYAAAdQL0kvgs647.png","userLevel":"G1","canTalk":true},"4122553":{"userId":9841779,"positionName":"hr","phone":null,"receiveEmail":null,"realName":"刘明江","portrait":"i/image3/M00/1C/43/Cgq2xlqEHGGAV6yeAAAyLIW_X3I890.png","userLevel":"G1","canTalk":true},"4601046":{"userId":10781804,"positionName":"大连HR","phone":null,"receiveEmail":null,"realName":"西陆森（大连）科技有限公司","portrait":"i/image2/M00/4D/0E/CgoB5lr7qIyAN1F1AAL02btgTFE533.jpg","userLevel":"G1","canTalk":true},"1279890":{"userId":775602,"positionName":"招聘主管","phone":null,"receiveEmail":null,"realName":"晓佳","portrait":null,"userLevel":"G1","canTalk":true},"4528182":{"userId":2047702,"positionName":"HR","phone":null,"receiveEmail":null,"realName":"Amber","portrait":null,"userLevel":"G1","canTalk":true},"4210846":{"userId":4610646,"positionName":"HR","phone":null,"receiveEmail":null,"realName":"孙妍","portrait":"i/image/M00/17/5A/Cgp3O1bxWLyAfjomAABToeghpRA35.jpeg","userLevel":"G1","canTalk":true},"4540283":{"userId":6504110,"positionName":"招聘主管","phone":null,"receiveEmail":null,"realName":"B-31855","portrait":"i/image3/M00/23/58/CgpOIFqVa4CAIJPzAAUJflazBNs937.jpg","userLevel":"G1","canTalk":true}}
         * positionResult : {"totalCount":107,"queryAnalysisInfo":{"positionName":"java","jobNature":null,"companyName":null,"industryName":null,"usefulCompany":false},"strategyProperty":{"name":"dm-csearch-useUserAllInterest","id":1},"hiTags":null,"locationInfo":{"city":"大连","district":null,"queryByGisCode":false,"businessZone":null,"locationCode":null,"isAllhotBusinessZone":false},"resultSize":15,"hotLabels":null,"result":[{"companyId":142626,"positionName":"JAVA软件工程师","workYear":"应届毕业生","education":"本科","jobNature":"全职","positionId":4638127,"companyShortName":"CLPS","createTime":"2018-05-28 16:54:54","score":0,"city":"大连","salary":"2k-3k","approve":1,"positionAdvantage":"福利待遇好,提可转正,带薪年假","financeStage":"未融资","industryField":"数据服务,金融","companySize":"500-2000人","companyLabelList":["专项奖金","带薪年假","定期体检","交通补助"],"publisherId":7418413,"district":"高新园区","companyLogo":"i/image/M00/4E/BD/Cgp3O1esORGAO1-rAAAIJJwGyjw584.png","positionLables":["实习"],"industryLables":[],"businessZones":["七贤岭"],"longitude":"121.513373","latitude":"38.847339","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"上海华钦信息科技股份有限公司","imState":"disabled","lastLogin":1527760949000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":1,"subwayline":"1号线","stationname":"河口","linestaion":"1号线_河口","formatCreateTime":"3天前发布"},{"companyId":53260,"positionName":"Java工程师","workYear":"不限","education":"大专","jobNature":"全职","positionId":4657574,"companyShortName":"桔子分期","createTime":"2018-05-31 14:37:40","score":0,"city":"大连","salary":"8k-12k","approve":1,"positionAdvantage":"五险一金,岗位晋升,绩效奖金,节日福利","financeStage":"A轮","industryField":"电子商务,金融","companySize":"150-500人","companyLabelList":["节日礼物","股票期权","绩效奖金","扁平管理"],"publisherId":6915040,"district":"高新园区","companyLogo":"i/image3/M00/4C/56/Cgq2xlrezSiAMV5LAAA-7l1x1BQ432.png","positionLables":["支付","电商","数据库","j2ee","第三方支付"],"industryLables":["支付","电商","数据库","j2ee","第三方支付"],"businessZones":["凌水","海事大学"],"longitude":"121.532257","latitude":"38.86512","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"北京桔子分期电子商务有限公司","imState":"disabled","lastLogin":1527757091000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"14:37发布"},{"companyId":40112,"positionName":"java开发","workYear":"1-3年","education":"本科","jobNature":"全职","positionId":4555370,"companyShortName":"华宇","createTime":"2018-05-29 14:03:50","score":0,"city":"大连","salary":"7k-14k","approve":1,"positionAdvantage":"超长年休假,股票期权,年终分红,免费班车","financeStage":"上市公司","industryField":"数据服务","companySize":"500-2000人","companyLabelList":["技能培训","节日礼物","绩效奖金","年度旅游"],"publisherId":6087052,"district":"甘井子区","companyLogo":"i/image/M00/50/F9/CgqKkVe1iJiAbjunAACnF_gGFG8445.png","positionLables":["MySQL","oracle"],"industryLables":[],"businessZones":null,"longitude":"0.0","latitude":"0.0","hitags":null,"resumeProcessRate":61,"resumeProcessDay":1,"companyFullName":"华宇（大连）信息服务有限公司","imState":"today","lastLogin":1527754763000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2天前发布"},{"companyId":71956,"positionName":"Java软件工程师","workYear":"1-3年","education":"大专","jobNature":"全职","positionId":4243410,"companyShortName":"大连盈科","createTime":"2018-05-28 08:54:11","score":0,"city":"大连","salary":"3k-6k","approve":1,"positionAdvantage":"五险,公积金,双休,不加班","financeStage":"不需要融资","industryField":"移动互联网,电子商务","companySize":"15-50人","companyLabelList":["绩效奖金","岗位晋升","五险一金"],"publisherId":1731102,"district":"高新园区","companyLogo":"image1/M00/28/C7/CgYXBlVivjCAWkTDAABAiY-aX74806.png","positionLables":["中级","软件开发","MySQL","j2ee"],"industryLables":[],"businessZones":["凌水","海事大学"],"longitude":"121.530234","latitude":"38.862692","hitags":null,"resumeProcessRate":100,"resumeProcessDay":1,"companyFullName":"大连盈科世纪技术开发有限公司","imState":"today","lastLogin":1527753012000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"3天前发布"},{"companyId":16831,"positionName":"java开发工程师","workYear":"不限","education":"本科","jobNature":"全职","positionId":4540283,"companyShortName":"武汉佰钧成技术有限公司","createTime":"2018-05-30 21:28:10","score":0,"city":"大连","salary":"12k-18k","approve":1,"positionAdvantage":"六险一金,带薪年假,弹性工作,免费体检","financeStage":"不需要融资","industryField":"移动互联网","companySize":"2000人以上","companyLabelList":["带薪年假","计算机软件","管理规范","定期体检"],"publisherId":6504110,"district":"高新园区","companyLogo":"i/image/M00/02/AB/CgqKkVaXX_6AaLKaAAAX52Kvjjg750.jpg","positionLables":["脚本","python"],"industryLables":[],"businessZones":["凌水","海事大学"],"longitude":"121.52285","latitude":"38.864996","hitags":["免费体检","6险1金"],"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"武汉佰钧成技术有限责任公司","imState":"today","lastLogin":1527694573000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"1天前发布"},{"companyId":362398,"positionName":"Java开发工程师","workYear":"1-3年","education":"不限","jobNature":"全职","positionId":4654406,"companyShortName":"锐英科技","createTime":"2018-05-30 23:51:04","score":0,"city":"大连","salary":"6K-12K","approve":0,"positionAdvantage":"有五险一金","financeStage":"未融资","industryField":"其他","companySize":"15-50人","companyLabelList":["\"\""],"publisherId":10540599,"district":"高新园区","companyLogo":"i/image3/M00/4A/8F/Cgq2xlrVrq-ATivYAAtYVkH2RM4101.jpg","positionLables":["高级","中级","初级"],"industryLables":[],"businessZones":null,"longitude":"121.526112","latitude":"38.857043","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连锐英科技有限公司","imState":"today","lastLogin":1527765056000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"1天前发布"},{"companyId":272648,"positionName":"对日java开发软件工程师","workYear":"3-5年","education":"大专","jobNature":"全职","positionId":4198599,"companyShortName":"大连维思创新科技","createTime":"2018-05-06 18:18:31","score":0,"city":"大连","salary":"3K-5K","approve":0,"positionAdvantage":"1、五险一金2、员工旅游3、交通补助","financeStage":"未融资","industryField":"移动互联网","companySize":"15-50人","companyLabelList":[],"publisherId":10006272,"district":"高新园区","companyLogo":"i/image3/M00/1C/F4/Cgq2xlqNF36AKfwDAAACt5yH3HM035.png","positionLables":["架构师","软件开发"],"industryLables":[],"businessZones":["火炬路"],"longitude":null,"latitude":null,"hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连维思创新科技有限公司","imState":"today","lastLogin":1527765290000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2018-05-06"},{"companyId":80771,"positionName":"高级Java工程师","workYear":"不限","education":"不限","jobNature":"全职","positionId":4528182,"companyShortName":"乐天创研","createTime":"2018-05-31 09:07:52","score":0,"city":"大连","salary":"20k-30k","approve":1,"positionAdvantage":"出国培训,跨境团队,年终奖金,赞助巴萨","financeStage":"上市公司","industryField":"电子商务,旅游","companySize":"2000人以上","companyLabelList":["技能培训","节日礼物","带薪年假","绩效奖金"],"publisherId":2047702,"district":"高新园区","companyLogo":"image1/M00/34/31/Cgo8PFWWNh2AHeOqAAATQPbTv9Q118.jpg?cc=0.08387353224679828","positionLables":["电商","软件开发","大数据"],"industryLables":["电商","软件开发","大数据"],"businessZones":["七贤岭"],"longitude":"121.51093","latitude":"38.847009","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"乐天创研（北京）科技有限公司","imState":"today","lastLogin":1527727443000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"12号线","stationname":"蔡大岭","linestaion":"1号线_河口;12号线_蔡大岭","formatCreateTime":"09:07发布"},{"companyId":109508,"positionName":"Java","workYear":"1-3年","education":"本科","jobNature":"全职","positionId":1461073,"companyShortName":"心水科技","createTime":"2018-05-21 14:43:15","score":0,"city":"大连","salary":"4k-8k","approve":0,"positionAdvantage":"宽松、灵活的工作环境（弹性上下班时间）","financeStage":"未融资","industryField":"电子商务,企业服务","companySize":"15-50人","companyLabelList":[],"publisherId":3479300,"district":"高新园区","companyLogo":"i/image/M00/03/96/Cgp3O1bBfLCAK56EAADJC-td87w981.png","positionLables":[],"industryLables":[],"businessZones":["火炬路","七贤岭","海事大学"],"longitude":"121.516647","latitude":"38.861778","hitags":null,"resumeProcessRate":100,"resumeProcessDay":4,"companyFullName":"大连心水科技有限公司","imState":"today","lastLogin":1527747557000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_七贤岭","formatCreateTime":"2018-05-21"},{"companyId":41758,"positionName":"高级Java开发工程师（SE）","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":1279890,"companyShortName":"英赛信息","createTime":"2018-05-31 09:58:47","score":0,"city":"大连","salary":"7k-12k","approve":0,"positionAdvantage":"良好的办公环境，优厚的福利待遇。","financeStage":"未融资","industryField":"企业服务","companySize":"15-50人","companyLabelList":["五险一金","办公环境良好","工作氛围融洽"],"publisherId":775602,"district":"高新园区","companyLogo":"i/image/M00/00/C8/Cgp3O1ZVeQeAUPNXAAAiojha0VY696.png","positionLables":["web","Mybatis","spring","jquery"],"industryLables":[],"businessZones":["火炬路","黄浦路","七贤岭"],"longitude":"121.52634044","latitude":"38.85970974","hitags":null,"resumeProcessRate":50,"resumeProcessDay":1,"companyFullName":"信义德信息技术服务（大连）有限公司","imState":"today","lastLogin":1527731866000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"技术","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"09:58发布"},{"companyId":392109,"positionName":"Java工程师","workYear":"3-5年","education":"大专","jobNature":"全职","positionId":4644597,"companyShortName":"贝莱科技","createTime":"2018-05-29 15:53:30","score":0,"city":"大连","salary":"10k-12k","approve":0,"positionAdvantage":"五险一金,带薪年假,周末双休,年底奖金","financeStage":"不需要融资","industryField":"移动互联网","companySize":"15-50人","companyLabelList":["\"\""],"publisherId":10900941,"district":"甘井子区","companyLogo":"i/image/M00/93/FA/CgpEMlsM-TeAcbMnAAAfYNS9bwE702.jpg","positionLables":["web","python"],"industryLables":[],"businessZones":["海事大学","凌水","火炬路"],"longitude":"121.530234","latitude":"38.862692","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"贝莱网络科技（大连）有限公司","imState":"today","lastLogin":1527749771000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"2天前发布"},{"companyId":369366,"positionName":"java","workYear":"1年以下","education":"大专","jobNature":"全职","positionId":4601046,"companyShortName":"SEA","createTime":"2018-05-21 15:03:54","score":0,"city":"大连","salary":"3K-5K","approve":0,"positionAdvantage":"正规公司，项目稳定。五险一金，周末双休。","financeStage":"未融资","industryField":"数据服务 企业服务","companySize":"50-150人","companyLabelList":["\"\""],"publisherId":10781804,"district":"中山区","companyLogo":"i/image2/M00/47/6F/CgoB5lrZVRSAemtOAABCPyn4BUI773.png","positionLables":["web","Javascript","CSS"],"industryLables":[],"businessZones":["中山广场"],"longitude":"121.644927","latitude":"38.918574","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"西陆森（大连）科技有限公司","imState":"today","lastLogin":1527750075000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"前端开发/移动开发","isSchoolJob":0,"subwayline":"九里线","stationname":"青泥洼桥","linestaion":"2号线_青泥洼桥;2号线_友好广场;2号线_中山广场;九里线_大连站","formatCreateTime":"2018-05-21"},{"companyId":80815,"positionName":"高级Java开发（信访）","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":4210846,"companyShortName":"北大软件","createTime":"2018-05-31 13:59:08","score":0,"city":"大连","salary":"6k-12k","approve":1,"positionAdvantage":"五险一金,定期体检,专业培训,餐饮补贴","financeStage":"未融资","industryField":"移动互联网,电子商务","companySize":"500-2000人","companyLabelList":["节日礼物","带薪年假","绩效奖金","年度旅游"],"publisherId":4610646,"district":"高新园区","companyLogo":"i/image3/M00/24/57/Cgq2xlqWZeWATv4qAAAQiql6bg8208.png","positionLables":["软件开发","大数据","web"],"industryLables":[],"businessZones":["七贤岭"],"longitude":"121.523498","latitude":"38.860909","hitags":null,"resumeProcessRate":5,"resumeProcessDay":1,"companyFullName":"北京北大软件工程股份有限公司","imState":"today","lastLogin":1527747976000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"13:59发布"},{"companyId":322535,"positionName":"对日java","workYear":"不限","education":"不限","jobNature":"全职","positionId":4122553,"companyShortName":"华小讯","createTime":"2018-05-29 20:21:34","score":0,"city":"大连","salary":"15K-30K","approve":0,"positionAdvantage":"有机会去日本出差","financeStage":"未融资","industryField":"移动互联网","companySize":"150-500人","companyLabelList":["\"\""],"publisherId":9841779,"district":"西岗区","companyLogo":"i/image3/M00/22/44/CgpOIFqUyDuAHZ3oAAAl7fd-Jo4612.png","positionLables":["后端开发","PHP","C/C++","C#/.NET","Python"],"industryLables":[],"businessZones":null,"longitude":"0.0","latitude":"0.0","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连华小讯科技有限公司","imState":"today","lastLogin":1527749027000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2天前发布"},{"companyId":250166,"positionName":"Java软件工程师","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":3516782,"companyShortName":"大连信科达科技","createTime":"2018-05-29 09:56:20","score":0,"city":"大连","salary":"8k-12k","approve":0,"positionAdvantage":"技术挑战","financeStage":"不需要融资","industryField":"其他,移动互联网","companySize":"少于15人","companyLabelList":[],"publisherId":8753619,"district":"沙河口区","companyLogo":"i/image/M00/64/DB/CgpEMlmaxjqAfL4WAAAMrd66L4w503.jpg","positionLables":["软件开发","前端","后端"],"industryLables":[],"businessZones":["星海广场"],"longitude":"121.591132","latitude":"38.889866","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连信科达科技有限公司","imState":"today","lastLogin":1527736149000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"星海广场","linestaion":"1号线_富国街;1号线_会展中心;1号线_星海广场","formatCreateTime":"2天前发布"}]}
         */

        private int pageNo;
        private int pageSize;
        private HrInfoMapBean hrInfoMap;
        private PositionResultBean positionResult;

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public HrInfoMapBean getHrInfoMap() {
            return hrInfoMap;
        }

        public void setHrInfoMap(HrInfoMapBean hrInfoMap) {
            this.hrInfoMap = hrInfoMap;
        }

        public PositionResultBean getPositionResult() {
            return positionResult;
        }

        public void setPositionResult(PositionResultBean positionResult) {
            this.positionResult = positionResult;
        }

        public static class HrInfoMapBean {
            @Override
            public String toString() {
                return "HrInfoMapBean{" +
                        "_$4644597=" + _$4644597 +
                        ", _$3516782=" + _$3516782 +
                        ", _$1461073=" + _$1461073 +
                        ", _$4654406=" + _$4654406 +
                        ", _$4657574=" + _$4657574 +
                        ", _$4243410=" + _$4243410 +
                        ", _$4198599=" + _$4198599 +
                        ", _$4638127=" + _$4638127 +
                        ", _$4555370=" + _$4555370 +
                        ", _$4122553=" + _$4122553 +
                        ", _$4601046=" + _$4601046 +
                        ", _$1279890=" + _$1279890 +
                        ", _$4528182=" + _$4528182 +
                        ", _$4210846=" + _$4210846 +
                        ", _$4540283=" + _$4540283 +
                        '}';
            }

            /**
             * 4644597 : {"userId":10900941,"positionName":"行政 人事 总助 企划","phone":null,"receiveEmail":null,"realName":"高雪","portrait":"i/image3/M00/53/79/CgpOIFsM72KAVmCdAAEID6zCnVY916.jpg","userLevel":"G1","canTalk":true}
             * 3516782 : {"userId":8753619,"positionName":"hr","phone":null,"receiveEmail":null,"realName":"thinkda","portrait":null,"userLevel":"G1","canTalk":true}
             * 1461073 : {"userId":3479300,"positionName":"经理","phone":null,"receiveEmail":null,"realName":"ryan","portrait":"i/image/M00/22/5D/CgqKkVcUpjyAVS8LAAQUlz9Zptg125.jpg","userLevel":"G1","canTalk":true}
             * 4654406 : {"userId":10540599,"positionName":"招聘专员","phone":null,"receiveEmail":null,"realName":"玉萃","portrait":"i/image2/M00/44/77/CgotOVrMUKCAaENmAABXAtWX9DE373.jpg","userLevel":"G1","canTalk":true}
             * 4657574 : {"userId":6915040,"positionName":"人事主管-大连","phone":null,"receiveEmail":null,"realName":"wanghaifei","portrait":null,"userLevel":"G1","canTalk":true}
             * 4243410 : {"userId":1731102,"positionName":"","phone":null,"receiveEmail":null,"realName":"人事","portrait":"i/image/M00/37/F5/CgpEMllCExyALHFrAAAJW5r_-R0153.gif","userLevel":"G1","canTalk":true}
             * 4198599 : {"userId":10006272,"positionName":"人事","phone":null,"receiveEmail":null,"realName":"谢莹莹","portrait":"i/image3/M00/27/03/Cgq2xlqZC9iALlSQAADLc93M0Io374.jpg","userLevel":"G1","canTalk":true}
             * 4638127 : {"userId":7418413,"positionName":"","phone":null,"receiveEmail":null,"realName":"amy.jiang","portrait":null,"userLevel":"G1","canTalk":true}
             * 4555370 : {"userId":6087052,"positionName":"招聘经理","phone":null,"receiveEmail":null,"realName":"TinaTian","portrait":"i/image/M00/8C/DA/CgpFT1r1DiiARhpYAAAdQL0kvgs647.png","userLevel":"G1","canTalk":true}
             * 4122553 : {"userId":9841779,"positionName":"hr","phone":null,"receiveEmail":null,"realName":"刘明江","portrait":"i/image3/M00/1C/43/Cgq2xlqEHGGAV6yeAAAyLIW_X3I890.png","userLevel":"G1","canTalk":true}
             * 4601046 : {"userId":10781804,"positionName":"大连HR","phone":null,"receiveEmail":null,"realName":"西陆森（大连）科技有限公司","portrait":"i/image2/M00/4D/0E/CgoB5lr7qIyAN1F1AAL02btgTFE533.jpg","userLevel":"G1","canTalk":true}
             * 1279890 : {"userId":775602,"positionName":"招聘主管","phone":null,"receiveEmail":null,"realName":"晓佳","portrait":null,"userLevel":"G1","canTalk":true}
             * 4528182 : {"userId":2047702,"positionName":"HR","phone":null,"receiveEmail":null,"realName":"Amber","portrait":null,"userLevel":"G1","canTalk":true}
             * 4210846 : {"userId":4610646,"positionName":"HR","phone":null,"receiveEmail":null,"realName":"孙妍","portrait":"i/image/M00/17/5A/Cgp3O1bxWLyAfjomAABToeghpRA35.jpeg","userLevel":"G1","canTalk":true}
             * 4540283 : {"userId":6504110,"positionName":"招聘主管","phone":null,"receiveEmail":null,"realName":"B-31855","portrait":"i/image3/M00/23/58/CgpOIFqVa4CAIJPzAAUJflazBNs937.jpg","userLevel":"G1","canTalk":true}
             */

            @com.google.gson.annotations.SerializedName("4644597")
            private _$4644597Bean _$4644597;
            @com.google.gson.annotations.SerializedName("3516782")
            private _$3516782Bean _$3516782;
            @com.google.gson.annotations.SerializedName("1461073")
            private _$1461073Bean _$1461073;
            @com.google.gson.annotations.SerializedName("4654406")
            private _$4654406Bean _$4654406;
            @com.google.gson.annotations.SerializedName("4657574")
            private _$4657574Bean _$4657574;
            @com.google.gson.annotations.SerializedName("4243410")
            private _$4243410Bean _$4243410;
            @com.google.gson.annotations.SerializedName("4198599")
            private _$4198599Bean _$4198599;
            @com.google.gson.annotations.SerializedName("4638127")
            private _$4638127Bean _$4638127;
            @com.google.gson.annotations.SerializedName("4555370")
            private _$4555370Bean _$4555370;
            @com.google.gson.annotations.SerializedName("4122553")
            private _$4122553Bean _$4122553;
            @com.google.gson.annotations.SerializedName("4601046")
            private _$4601046Bean _$4601046;
            @com.google.gson.annotations.SerializedName("1279890")
            private _$1279890Bean _$1279890;
            @com.google.gson.annotations.SerializedName("4528182")
            private _$4528182Bean _$4528182;
            @com.google.gson.annotations.SerializedName("4210846")
            private _$4210846Bean _$4210846;
            @com.google.gson.annotations.SerializedName("4540283")
            private _$4540283Bean _$4540283;

            public _$4644597Bean get_$4644597() {
                return _$4644597;
            }

            public void set_$4644597(_$4644597Bean _$4644597) {
                this._$4644597 = _$4644597;
            }

            public _$3516782Bean get_$3516782() {
                return _$3516782;
            }

            public void set_$3516782(_$3516782Bean _$3516782) {
                this._$3516782 = _$3516782;
            }

            public _$1461073Bean get_$1461073() {
                return _$1461073;
            }

            public void set_$1461073(_$1461073Bean _$1461073) {
                this._$1461073 = _$1461073;
            }

            public _$4654406Bean get_$4654406() {
                return _$4654406;
            }

            public void set_$4654406(_$4654406Bean _$4654406) {
                this._$4654406 = _$4654406;
            }

            public _$4657574Bean get_$4657574() {
                return _$4657574;
            }

            public void set_$4657574(_$4657574Bean _$4657574) {
                this._$4657574 = _$4657574;
            }

            public _$4243410Bean get_$4243410() {
                return _$4243410;
            }

            public void set_$4243410(_$4243410Bean _$4243410) {
                this._$4243410 = _$4243410;
            }

            public _$4198599Bean get_$4198599() {
                return _$4198599;
            }

            public void set_$4198599(_$4198599Bean _$4198599) {
                this._$4198599 = _$4198599;
            }

            public _$4638127Bean get_$4638127() {
                return _$4638127;
            }

            public void set_$4638127(_$4638127Bean _$4638127) {
                this._$4638127 = _$4638127;
            }

            public _$4555370Bean get_$4555370() {
                return _$4555370;
            }

            public void set_$4555370(_$4555370Bean _$4555370) {
                this._$4555370 = _$4555370;
            }

            public _$4122553Bean get_$4122553() {
                return _$4122553;
            }

            public void set_$4122553(_$4122553Bean _$4122553) {
                this._$4122553 = _$4122553;
            }

            public _$4601046Bean get_$4601046() {
                return _$4601046;
            }

            public void set_$4601046(_$4601046Bean _$4601046) {
                this._$4601046 = _$4601046;
            }

            public _$1279890Bean get_$1279890() {
                return _$1279890;
            }

            public void set_$1279890(_$1279890Bean _$1279890) {
                this._$1279890 = _$1279890;
            }

            public _$4528182Bean get_$4528182() {
                return _$4528182;
            }

            public void set_$4528182(_$4528182Bean _$4528182) {
                this._$4528182 = _$4528182;
            }

            public _$4210846Bean get_$4210846() {
                return _$4210846;
            }

            public void set_$4210846(_$4210846Bean _$4210846) {
                this._$4210846 = _$4210846;
            }

            public _$4540283Bean get_$4540283() {
                return _$4540283;
            }

            public void set_$4540283(_$4540283Bean _$4540283) {
                this._$4540283 = _$4540283;
            }

            public static class _$4644597Bean {
                @Override
                public String toString() {
                    return "_$4644597Bean{" +
                            "userId=" + userId +
                            ", positionName='" + positionName + '\'' +
                            ", phone=" + phone +
                            ", receiveEmail=" + receiveEmail +
                            ", realName='" + realName + '\'' +
                            ", portrait='" + portrait + '\'' +
                            ", userLevel='" + userLevel + '\'' +
                            ", canTalk=" + canTalk +
                            '}';
                }

                /**
                 * userId : 10900941
                 * positionName : 行政 人事 总助 企划
                 * phone : null
                 * receiveEmail : null
                 * realName : 高雪
                 * portrait : i/image3/M00/53/79/CgpOIFsM72KAVmCdAAEID6zCnVY916.jpg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$3516782Bean {
                /**
                 * userId : 8753619
                 * positionName : hr
                 * phone : null
                 * receiveEmail : null
                 * realName : thinkda
                 * portrait : null
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private Object portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public Object getPortrait() {
                    return portrait;
                }

                public void setPortrait(Object portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$1461073Bean {
                /**
                 * userId : 3479300
                 * positionName : 经理
                 * phone : null
                 * receiveEmail : null
                 * realName : ryan
                 * portrait : i/image/M00/22/5D/CgqKkVcUpjyAVS8LAAQUlz9Zptg125.jpg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4654406Bean {
                /**
                 * userId : 10540599
                 * positionName : 招聘专员
                 * phone : null
                 * receiveEmail : null
                 * realName : 玉萃
                 * portrait : i/image2/M00/44/77/CgotOVrMUKCAaENmAABXAtWX9DE373.jpg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4657574Bean {
                /**
                 * userId : 6915040
                 * positionName : 人事主管-大连
                 * phone : null
                 * receiveEmail : null
                 * realName : wanghaifei
                 * portrait : null
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private Object portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public Object getPortrait() {
                    return portrait;
                }

                public void setPortrait(Object portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4243410Bean {
                /**
                 * userId : 1731102
                 * positionName :
                 * phone : null
                 * receiveEmail : null
                 * realName : 人事
                 * portrait : i/image/M00/37/F5/CgpEMllCExyALHFrAAAJW5r_-R0153.gif
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4198599Bean {
                /**
                 * userId : 10006272
                 * positionName : 人事
                 * phone : null
                 * receiveEmail : null
                 * realName : 谢莹莹
                 * portrait : i/image3/M00/27/03/Cgq2xlqZC9iALlSQAADLc93M0Io374.jpg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4638127Bean {
                /**
                 * userId : 7418413
                 * positionName :
                 * phone : null
                 * receiveEmail : null
                 * realName : amy.jiang
                 * portrait : null
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private Object portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public Object getPortrait() {
                    return portrait;
                }

                public void setPortrait(Object portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4555370Bean {
                /**
                 * userId : 6087052
                 * positionName : 招聘经理
                 * phone : null
                 * receiveEmail : null
                 * realName : TinaTian
                 * portrait : i/image/M00/8C/DA/CgpFT1r1DiiARhpYAAAdQL0kvgs647.png
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4122553Bean {
                /**
                 * userId : 9841779
                 * positionName : hr
                 * phone : null
                 * receiveEmail : null
                 * realName : 刘明江
                 * portrait : i/image3/M00/1C/43/Cgq2xlqEHGGAV6yeAAAyLIW_X3I890.png
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4601046Bean {
                /**
                 * userId : 10781804
                 * positionName : 大连HR
                 * phone : null
                 * receiveEmail : null
                 * realName : 西陆森（大连）科技有限公司
                 * portrait : i/image2/M00/4D/0E/CgoB5lr7qIyAN1F1AAL02btgTFE533.jpg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$1279890Bean {
                /**
                 * userId : 775602
                 * positionName : 招聘主管
                 * phone : null
                 * receiveEmail : null
                 * realName : 晓佳
                 * portrait : null
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private Object portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public Object getPortrait() {
                    return portrait;
                }

                public void setPortrait(Object portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4528182Bean {
                /**
                 * userId : 2047702
                 * positionName : HR
                 * phone : null
                 * receiveEmail : null
                 * realName : Amber
                 * portrait : null
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private Object portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public Object getPortrait() {
                    return portrait;
                }

                public void setPortrait(Object portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4210846Bean {
                /**
                 * userId : 4610646
                 * positionName : HR
                 * phone : null
                 * receiveEmail : null
                 * realName : 孙妍
                 * portrait : i/image/M00/17/5A/Cgp3O1bxWLyAfjomAABToeghpRA35.jpeg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }

            public static class _$4540283Bean {
                /**
                 * userId : 6504110
                 * positionName : 招聘主管
                 * phone : null
                 * receiveEmail : null
                 * realName : B-31855
                 * portrait : i/image3/M00/23/58/CgpOIFqVa4CAIJPzAAUJflazBNs937.jpg
                 * userLevel : G1
                 * canTalk : true
                 */

                private int userId;
                private String positionName;
                private Object phone;
                private Object receiveEmail;
                private String realName;
                private String portrait;
                private String userLevel;
                private boolean canTalk;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
                    this.phone = phone;
                }

                public Object getReceiveEmail() {
                    return receiveEmail;
                }

                public void setReceiveEmail(Object receiveEmail) {
                    this.receiveEmail = receiveEmail;
                }

                public String getRealName() {
                    return realName;
                }

                public void setRealName(String realName) {
                    this.realName = realName;
                }

                public String getPortrait() {
                    return portrait;
                }

                public void setPortrait(String portrait) {
                    this.portrait = portrait;
                }

                public String getUserLevel() {
                    return userLevel;
                }

                public void setUserLevel(String userLevel) {
                    this.userLevel = userLevel;
                }

                public boolean isCanTalk() {
                    return canTalk;
                }

                public void setCanTalk(boolean canTalk) {
                    this.canTalk = canTalk;
                }
            }
        }

        public static class PositionResultBean {
            /**
             * totalCount : 107
             * queryAnalysisInfo : {"positionName":"java","jobNature":null,"companyName":null,"industryName":null,"usefulCompany":false}
             * strategyProperty : {"name":"dm-csearch-useUserAllInterest","id":1}
             * hiTags : null
             * locationInfo : {"city":"大连","district":null,"queryByGisCode":false,"businessZone":null,"locationCode":null,"isAllhotBusinessZone":false}
             * resultSize : 15
             * hotLabels : null
             * result : [{"companyId":142626,"positionName":"JAVA软件工程师","workYear":"应届毕业生","education":"本科","jobNature":"全职","positionId":4638127,"companyShortName":"CLPS","createTime":"2018-05-28 16:54:54","score":0,"city":"大连","salary":"2k-3k","approve":1,"positionAdvantage":"福利待遇好,提可转正,带薪年假","financeStage":"未融资","industryField":"数据服务,金融","companySize":"500-2000人","companyLabelList":["专项奖金","带薪年假","定期体检","交通补助"],"publisherId":7418413,"district":"高新园区","companyLogo":"i/image/M00/4E/BD/Cgp3O1esORGAO1-rAAAIJJwGyjw584.png","positionLables":["实习"],"industryLables":[],"businessZones":["七贤岭"],"longitude":"121.513373","latitude":"38.847339","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"上海华钦信息科技股份有限公司","imState":"disabled","lastLogin":1527760949000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":1,"subwayline":"1号线","stationname":"河口","linestaion":"1号线_河口","formatCreateTime":"3天前发布"},{"companyId":53260,"positionName":"Java工程师","workYear":"不限","education":"大专","jobNature":"全职","positionId":4657574,"companyShortName":"桔子分期","createTime":"2018-05-31 14:37:40","score":0,"city":"大连","salary":"8k-12k","approve":1,"positionAdvantage":"五险一金,岗位晋升,绩效奖金,节日福利","financeStage":"A轮","industryField":"电子商务,金融","companySize":"150-500人","companyLabelList":["节日礼物","股票期权","绩效奖金","扁平管理"],"publisherId":6915040,"district":"高新园区","companyLogo":"i/image3/M00/4C/56/Cgq2xlrezSiAMV5LAAA-7l1x1BQ432.png","positionLables":["支付","电商","数据库","j2ee","第三方支付"],"industryLables":["支付","电商","数据库","j2ee","第三方支付"],"businessZones":["凌水","海事大学"],"longitude":"121.532257","latitude":"38.86512","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"北京桔子分期电子商务有限公司","imState":"disabled","lastLogin":1527757091000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"14:37发布"},{"companyId":40112,"positionName":"java开发","workYear":"1-3年","education":"本科","jobNature":"全职","positionId":4555370,"companyShortName":"华宇","createTime":"2018-05-29 14:03:50","score":0,"city":"大连","salary":"7k-14k","approve":1,"positionAdvantage":"超长年休假,股票期权,年终分红,免费班车","financeStage":"上市公司","industryField":"数据服务","companySize":"500-2000人","companyLabelList":["技能培训","节日礼物","绩效奖金","年度旅游"],"publisherId":6087052,"district":"甘井子区","companyLogo":"i/image/M00/50/F9/CgqKkVe1iJiAbjunAACnF_gGFG8445.png","positionLables":["MySQL","oracle"],"industryLables":[],"businessZones":null,"longitude":"0.0","latitude":"0.0","hitags":null,"resumeProcessRate":61,"resumeProcessDay":1,"companyFullName":"华宇（大连）信息服务有限公司","imState":"today","lastLogin":1527754763000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2天前发布"},{"companyId":71956,"positionName":"Java软件工程师","workYear":"1-3年","education":"大专","jobNature":"全职","positionId":4243410,"companyShortName":"大连盈科","createTime":"2018-05-28 08:54:11","score":0,"city":"大连","salary":"3k-6k","approve":1,"positionAdvantage":"五险,公积金,双休,不加班","financeStage":"不需要融资","industryField":"移动互联网,电子商务","companySize":"15-50人","companyLabelList":["绩效奖金","岗位晋升","五险一金"],"publisherId":1731102,"district":"高新园区","companyLogo":"image1/M00/28/C7/CgYXBlVivjCAWkTDAABAiY-aX74806.png","positionLables":["中级","软件开发","MySQL","j2ee"],"industryLables":[],"businessZones":["凌水","海事大学"],"longitude":"121.530234","latitude":"38.862692","hitags":null,"resumeProcessRate":100,"resumeProcessDay":1,"companyFullName":"大连盈科世纪技术开发有限公司","imState":"today","lastLogin":1527753012000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"3天前发布"},{"companyId":16831,"positionName":"java开发工程师","workYear":"不限","education":"本科","jobNature":"全职","positionId":4540283,"companyShortName":"武汉佰钧成技术有限公司","createTime":"2018-05-30 21:28:10","score":0,"city":"大连","salary":"12k-18k","approve":1,"positionAdvantage":"六险一金,带薪年假,弹性工作,免费体检","financeStage":"不需要融资","industryField":"移动互联网","companySize":"2000人以上","companyLabelList":["带薪年假","计算机软件","管理规范","定期体检"],"publisherId":6504110,"district":"高新园区","companyLogo":"i/image/M00/02/AB/CgqKkVaXX_6AaLKaAAAX52Kvjjg750.jpg","positionLables":["脚本","python"],"industryLables":[],"businessZones":["凌水","海事大学"],"longitude":"121.52285","latitude":"38.864996","hitags":["免费体检","6险1金"],"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"武汉佰钧成技术有限责任公司","imState":"today","lastLogin":1527694573000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"1天前发布"},{"companyId":362398,"positionName":"Java开发工程师","workYear":"1-3年","education":"不限","jobNature":"全职","positionId":4654406,"companyShortName":"锐英科技","createTime":"2018-05-30 23:51:04","score":0,"city":"大连","salary":"6K-12K","approve":0,"positionAdvantage":"有五险一金","financeStage":"未融资","industryField":"其他","companySize":"15-50人","companyLabelList":["\"\""],"publisherId":10540599,"district":"高新园区","companyLogo":"i/image3/M00/4A/8F/Cgq2xlrVrq-ATivYAAtYVkH2RM4101.jpg","positionLables":["高级","中级","初级"],"industryLables":[],"businessZones":null,"longitude":"121.526112","latitude":"38.857043","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连锐英科技有限公司","imState":"today","lastLogin":1527765056000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"1天前发布"},{"companyId":272648,"positionName":"对日java开发软件工程师","workYear":"3-5年","education":"大专","jobNature":"全职","positionId":4198599,"companyShortName":"大连维思创新科技","createTime":"2018-05-06 18:18:31","score":0,"city":"大连","salary":"3K-5K","approve":0,"positionAdvantage":"1、五险一金2、员工旅游3、交通补助","financeStage":"未融资","industryField":"移动互联网","companySize":"15-50人","companyLabelList":[],"publisherId":10006272,"district":"高新园区","companyLogo":"i/image3/M00/1C/F4/Cgq2xlqNF36AKfwDAAACt5yH3HM035.png","positionLables":["架构师","软件开发"],"industryLables":[],"businessZones":["火炬路"],"longitude":null,"latitude":null,"hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连维思创新科技有限公司","imState":"today","lastLogin":1527765290000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2018-05-06"},{"companyId":80771,"positionName":"高级Java工程师","workYear":"不限","education":"不限","jobNature":"全职","positionId":4528182,"companyShortName":"乐天创研","createTime":"2018-05-31 09:07:52","score":0,"city":"大连","salary":"20k-30k","approve":1,"positionAdvantage":"出国培训,跨境团队,年终奖金,赞助巴萨","financeStage":"上市公司","industryField":"电子商务,旅游","companySize":"2000人以上","companyLabelList":["技能培训","节日礼物","带薪年假","绩效奖金"],"publisherId":2047702,"district":"高新园区","companyLogo":"image1/M00/34/31/Cgo8PFWWNh2AHeOqAAATQPbTv9Q118.jpg?cc=0.08387353224679828","positionLables":["电商","软件开发","大数据"],"industryLables":["电商","软件开发","大数据"],"businessZones":["七贤岭"],"longitude":"121.51093","latitude":"38.847009","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"乐天创研（北京）科技有限公司","imState":"today","lastLogin":1527727443000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"12号线","stationname":"蔡大岭","linestaion":"1号线_河口;12号线_蔡大岭","formatCreateTime":"09:07发布"},{"companyId":109508,"positionName":"Java","workYear":"1-3年","education":"本科","jobNature":"全职","positionId":1461073,"companyShortName":"心水科技","createTime":"2018-05-21 14:43:15","score":0,"city":"大连","salary":"4k-8k","approve":0,"positionAdvantage":"宽松、灵活的工作环境（弹性上下班时间）","financeStage":"未融资","industryField":"电子商务,企业服务","companySize":"15-50人","companyLabelList":[],"publisherId":3479300,"district":"高新园区","companyLogo":"i/image/M00/03/96/Cgp3O1bBfLCAK56EAADJC-td87w981.png","positionLables":[],"industryLables":[],"businessZones":["火炬路","七贤岭","海事大学"],"longitude":"121.516647","latitude":"38.861778","hitags":null,"resumeProcessRate":100,"resumeProcessDay":4,"companyFullName":"大连心水科技有限公司","imState":"today","lastLogin":1527747557000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_七贤岭","formatCreateTime":"2018-05-21"},{"companyId":41758,"positionName":"高级Java开发工程师（SE）","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":1279890,"companyShortName":"英赛信息","createTime":"2018-05-31 09:58:47","score":0,"city":"大连","salary":"7k-12k","approve":0,"positionAdvantage":"良好的办公环境，优厚的福利待遇。","financeStage":"未融资","industryField":"企业服务","companySize":"15-50人","companyLabelList":["五险一金","办公环境良好","工作氛围融洽"],"publisherId":775602,"district":"高新园区","companyLogo":"i/image/M00/00/C8/Cgp3O1ZVeQeAUPNXAAAiojha0VY696.png","positionLables":["web","Mybatis","spring","jquery"],"industryLables":[],"businessZones":["火炬路","黄浦路","七贤岭"],"longitude":"121.52634044","latitude":"38.85970974","hitags":null,"resumeProcessRate":50,"resumeProcessDay":1,"companyFullName":"信义德信息技术服务（大连）有限公司","imState":"today","lastLogin":1527731866000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"技术","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"09:58发布"},{"companyId":392109,"positionName":"Java工程师","workYear":"3-5年","education":"大专","jobNature":"全职","positionId":4644597,"companyShortName":"贝莱科技","createTime":"2018-05-29 15:53:30","score":0,"city":"大连","salary":"10k-12k","approve":0,"positionAdvantage":"五险一金,带薪年假,周末双休,年底奖金","financeStage":"不需要融资","industryField":"移动互联网","companySize":"15-50人","companyLabelList":["\"\""],"publisherId":10900941,"district":"甘井子区","companyLogo":"i/image/M00/93/FA/CgpEMlsM-TeAcbMnAAAfYNS9bwE702.jpg","positionLables":["web","python"],"industryLables":[],"businessZones":["海事大学","凌水","火炬路"],"longitude":"121.530234","latitude":"38.862692","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"贝莱网络科技（大连）有限公司","imState":"today","lastLogin":1527749771000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"2天前发布"},{"companyId":369366,"positionName":"java","workYear":"1年以下","education":"大专","jobNature":"全职","positionId":4601046,"companyShortName":"SEA","createTime":"2018-05-21 15:03:54","score":0,"city":"大连","salary":"3K-5K","approve":0,"positionAdvantage":"正规公司，项目稳定。五险一金，周末双休。","financeStage":"未融资","industryField":"数据服务 企业服务","companySize":"50-150人","companyLabelList":["\"\""],"publisherId":10781804,"district":"中山区","companyLogo":"i/image2/M00/47/6F/CgoB5lrZVRSAemtOAABCPyn4BUI773.png","positionLables":["web","Javascript","CSS"],"industryLables":[],"businessZones":["中山广场"],"longitude":"121.644927","latitude":"38.918574","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"西陆森（大连）科技有限公司","imState":"today","lastLogin":1527750075000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"前端开发/移动开发","isSchoolJob":0,"subwayline":"九里线","stationname":"青泥洼桥","linestaion":"2号线_青泥洼桥;2号线_友好广场;2号线_中山广场;九里线_大连站","formatCreateTime":"2018-05-21"},{"companyId":80815,"positionName":"高级Java开发（信访）","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":4210846,"companyShortName":"北大软件","createTime":"2018-05-31 13:59:08","score":0,"city":"大连","salary":"6k-12k","approve":1,"positionAdvantage":"五险一金,定期体检,专业培训,餐饮补贴","financeStage":"未融资","industryField":"移动互联网,电子商务","companySize":"500-2000人","companyLabelList":["节日礼物","带薪年假","绩效奖金","年度旅游"],"publisherId":4610646,"district":"高新园区","companyLogo":"i/image3/M00/24/57/Cgq2xlqWZeWATv4qAAAQiql6bg8208.png","positionLables":["软件开发","大数据","web"],"industryLables":[],"businessZones":["七贤岭"],"longitude":"121.523498","latitude":"38.860909","hitags":null,"resumeProcessRate":5,"resumeProcessDay":1,"companyFullName":"北京北大软件工程股份有限公司","imState":"today","lastLogin":1527747976000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"七贤岭","linestaion":"1号线_海事大学;1号线_七贤岭","formatCreateTime":"13:59发布"},{"companyId":322535,"positionName":"对日java","workYear":"不限","education":"不限","jobNature":"全职","positionId":4122553,"companyShortName":"华小讯","createTime":"2018-05-29 20:21:34","score":0,"city":"大连","salary":"15K-30K","approve":0,"positionAdvantage":"有机会去日本出差","financeStage":"未融资","industryField":"移动互联网","companySize":"150-500人","companyLabelList":["\"\""],"publisherId":9841779,"district":"西岗区","companyLogo":"i/image3/M00/22/44/CgpOIFqUyDuAHZ3oAAAl7fd-Jo4612.png","positionLables":["后端开发","PHP","C/C++","C#/.NET","Python"],"industryLables":[],"businessZones":null,"longitude":"0.0","latitude":"0.0","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连华小讯科技有限公司","imState":"today","lastLogin":1527749027000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"后端开发","isSchoolJob":0,"subwayline":null,"stationname":null,"linestaion":null,"formatCreateTime":"2天前发布"},{"companyId":250166,"positionName":"Java软件工程师","workYear":"3-5年","education":"本科","jobNature":"全职","positionId":3516782,"companyShortName":"大连信科达科技","createTime":"2018-05-29 09:56:20","score":0,"city":"大连","salary":"8k-12k","approve":0,"positionAdvantage":"技术挑战","financeStage":"不需要融资","industryField":"其他,移动互联网","companySize":"少于15人","companyLabelList":[],"publisherId":8753619,"district":"沙河口区","companyLogo":"i/image/M00/64/DB/CgpEMlmaxjqAfL4WAAAMrd66L4w503.jpg","positionLables":["软件开发","前端","后端"],"industryLables":[],"businessZones":["星海广场"],"longitude":"121.591132","latitude":"38.889866","hitags":null,"resumeProcessRate":0,"resumeProcessDay":0,"companyFullName":"大连信科达科技有限公司","imState":"today","lastLogin":1527736149000,"explain":null,"adWord":0,"plus":null,"pcShow":0,"appShow":0,"deliver":0,"gradeDescription":null,"promotionScoreExplain":null,"firstType":"开发/测试/运维类","secondType":"软件开发","isSchoolJob":0,"subwayline":"1号线","stationname":"星海广场","linestaion":"1号线_富国街;1号线_会展中心;1号线_星海广场","formatCreateTime":"2天前发布"}]
             */

            private int totalCount;
            private QueryAnalysisInfoBean queryAnalysisInfo;
            private StrategyPropertyBean strategyProperty;
            private Object hiTags;
            private LocationInfoBean locationInfo;
            private int resultSize;
            private Object hotLabels;
            private List<ResultBean> result;

            public int getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(int totalCount) {
                this.totalCount = totalCount;
            }

            public QueryAnalysisInfoBean getQueryAnalysisInfo() {
                return queryAnalysisInfo;
            }

            public void setQueryAnalysisInfo(QueryAnalysisInfoBean queryAnalysisInfo) {
                this.queryAnalysisInfo = queryAnalysisInfo;
            }

            public StrategyPropertyBean getStrategyProperty() {
                return strategyProperty;
            }

            public void setStrategyProperty(StrategyPropertyBean strategyProperty) {
                this.strategyProperty = strategyProperty;
            }

            public Object getHiTags() {
                return hiTags;
            }

            public void setHiTags(Object hiTags) {
                this.hiTags = hiTags;
            }

            public LocationInfoBean getLocationInfo() {
                return locationInfo;
            }

            public void setLocationInfo(LocationInfoBean locationInfo) {
                this.locationInfo = locationInfo;
            }

            public int getResultSize() {
                return resultSize;
            }

            public void setResultSize(int resultSize) {
                this.resultSize = resultSize;
            }

            public Object getHotLabels() {
                return hotLabels;
            }

            public void setHotLabels(Object hotLabels) {
                this.hotLabels = hotLabels;
            }

            public List<ResultBean> getResult() {
                return result;
            }

            public void setResult(List<ResultBean> result) {
                this.result = result;
            }

            public static class QueryAnalysisInfoBean {
                /**
                 * positionName : java
                 * jobNature : null
                 * companyName : null
                 * industryName : null
                 * usefulCompany : false
                 */

                private String positionName;
                private Object jobNature;
                private Object companyName;
                private Object industryName;
                private boolean usefulCompany;

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public Object getJobNature() {
                    return jobNature;
                }

                public void setJobNature(Object jobNature) {
                    this.jobNature = jobNature;
                }

                public Object getCompanyName() {
                    return companyName;
                }

                public void setCompanyName(Object companyName) {
                    this.companyName = companyName;
                }

                public Object getIndustryName() {
                    return industryName;
                }

                public void setIndustryName(Object industryName) {
                    this.industryName = industryName;
                }

                public boolean isUsefulCompany() {
                    return usefulCompany;
                }

                public void setUsefulCompany(boolean usefulCompany) {
                    this.usefulCompany = usefulCompany;
                }
            }

            public static class StrategyPropertyBean {
                /**
                 * name : dm-csearch-useUserAllInterest
                 * id : 1
                 */

                private String name;
                private int id;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }

            public static class LocationInfoBean {
                /**
                 * city : 大连
                 * district : null
                 * queryByGisCode : false
                 * businessZone : null
                 * locationCode : null
                 * isAllhotBusinessZone : false
                 */

                private String city;
                private Object district;
                private boolean queryByGisCode;
                private Object businessZone;
                private Object locationCode;
                private boolean isAllhotBusinessZone;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public Object getDistrict() {
                    return district;
                }

                public void setDistrict(Object district) {
                    this.district = district;
                }

                public boolean isQueryByGisCode() {
                    return queryByGisCode;
                }

                public void setQueryByGisCode(boolean queryByGisCode) {
                    this.queryByGisCode = queryByGisCode;
                }

                public Object getBusinessZone() {
                    return businessZone;
                }

                public void setBusinessZone(Object businessZone) {
                    this.businessZone = businessZone;
                }

                public Object getLocationCode() {
                    return locationCode;
                }

                public void setLocationCode(Object locationCode) {
                    this.locationCode = locationCode;
                }

                public boolean isIsAllhotBusinessZone() {
                    return isAllhotBusinessZone;
                }

                public void setIsAllhotBusinessZone(boolean isAllhotBusinessZone) {
                    this.isAllhotBusinessZone = isAllhotBusinessZone;
                }
            }

            public static class ResultBean {
                @Override
                public String toString() {
                    return "ResultBean{" +
                            "companyId=" + companyId +
                            ", positionName='" + positionName + '\'' +
                            ", workYear='" + workYear + '\'' +
                            ", education='" + education + '\'' +
                            ", jobNature='" + jobNature + '\'' +
                            ", positionId=" + positionId +
                            ", companyShortName='" + companyShortName + '\'' +
                            ", createTime='" + createTime + '\'' +
                            ", score=" + score +
                            ", city='" + city + '\'' +
                            ", salary='" + salary + '\'' +
                            ", approve=" + approve +
                            ", positionAdvantage='" + positionAdvantage + '\'' +
                            ", financeStage='" + financeStage + '\'' +
                            ", industryField='" + industryField + '\'' +
                            ", companySize='" + companySize + '\'' +
                            ", publisherId=" + publisherId +
                            ", district='" + district + '\'' +
                            ", companyLogo='" + companyLogo + '\'' +
                            ", longitude='" + longitude + '\'' +
                            ", latitude='" + latitude + '\'' +
                            ", hitags=" + hitags +
                            ", resumeProcessRate=" + resumeProcessRate +
                            ", resumeProcessDay=" + resumeProcessDay +
                            ", companyFullName='" + companyFullName + '\'' +
                            ", imState='" + imState + '\'' +
                            ", lastLogin=" + lastLogin +
                            ", explain=" + explain +
                            ", adWord=" + adWord +
                            ", plus=" + plus +
                            ", pcShow=" + pcShow +
                            ", appShow=" + appShow +
                            ", deliver=" + deliver +
                            ", gradeDescription=" + gradeDescription +
                            ", promotionScoreExplain=" + promotionScoreExplain +
                            ", firstType='" + firstType + '\'' +
                            ", secondType='" + secondType + '\'' +
                            ", isSchoolJob=" + isSchoolJob +
                            ", subwayline='" + subwayline + '\'' +
                            ", stationname='" + stationname + '\'' +
                            ", linestaion='" + linestaion + '\'' +
                            ", formatCreateTime='" + formatCreateTime + '\'' +
                            ", companyLabelList=" + companyLabelList +
                            ", positionLables=" + positionLables +
                            ", industryLables=" + industryLables +
                            ", businessZones=" + businessZones +
                            '}';
                }

                /**
                 * companyId : 142626
                 * positionName : JAVA软件工程师
                 * workYear : 应届毕业生
                 * education : 本科
                 * jobNature : 全职
                 * positionId : 4638127
                 * companyShortName : CLPS
                 * createTime : 2018-05-28 16:54:54
                 * score : 0
                 * city : 大连
                 * salary : 2k-3k
                 * approve : 1
                 * positionAdvantage : 福利待遇好,提可转正,带薪年假
                 * financeStage : 未融资
                 * industryField : 数据服务,金融
                 * companySize : 500-2000人
                 * companyLabelList : ["专项奖金","带薪年假","定期体检","交通补助"]
                 * publisherId : 7418413
                 * district : 高新园区
                 * companyLogo : i/image/M00/4E/BD/Cgp3O1esORGAO1-rAAAIJJwGyjw584.png
                 * positionLables : ["实习"]
                 * industryLables : []
                 * businessZones : ["七贤岭"]
                 * longitude : 121.513373
                 * latitude : 38.847339
                 * hitags : null
                 * resumeProcessRate : 0
                 * resumeProcessDay : 0
                 * companyFullName : 上海华钦信息科技股份有限公司
                 * imState : disabled
                 * lastLogin : 1527760949000
                 * explain : null
                 * adWord : 0
                 * plus : null
                 * pcShow : 0
                 * appShow : 0
                 * deliver : 0
                 * gradeDescription : null
                 * promotionScoreExplain : null
                 * firstType : 开发/测试/运维类
                 * secondType : 后端开发
                 * isSchoolJob : 1
                 * subwayline : 1号线
                 * stationname : 河口
                 * linestaion : 1号线_河口
                 * formatCreateTime : 3天前发布
                 */

                private int companyId;
                private String positionName;
                private String workYear;
                private String education;
                private String jobNature;
                private int positionId;
                private String companyShortName;
                private String createTime;
                private int score;
                private String city;
                private String salary;
                private int approve;
                private String positionAdvantage;
                private String financeStage;
                private String industryField;
                private String companySize;
                private int publisherId;
                private String district;
                private String companyLogo;
                private String longitude;
                private String latitude;
                private Object hitags;
                private int resumeProcessRate;
                private int resumeProcessDay;
                private String companyFullName;
                private String imState;
                private long lastLogin;
                private Object explain;
                private int adWord;
                private Object plus;
                private int pcShow;
                private int appShow;
                private int deliver;
                private Object gradeDescription;
                private Object promotionScoreExplain;
                private String firstType;
                private String secondType;
                private int isSchoolJob;
                private String subwayline;
                private String stationname;
                private String linestaion;
                private String formatCreateTime;
                private List<String> companyLabelList;
                private List<String> positionLables;
                private List<?> industryLables;
                private List<String> businessZones;

                public int getCompanyId() {
                    return companyId;
                }

                public void setCompanyId(int companyId) {
                    this.companyId = companyId;
                }

                public String getPositionName() {
                    return positionName;
                }

                public void setPositionName(String positionName) {
                    this.positionName = positionName;
                }

                public String getWorkYear() {
                    return workYear;
                }

                public void setWorkYear(String workYear) {
                    this.workYear = workYear;
                }

                public String getEducation() {
                    return education;
                }

                public void setEducation(String education) {
                    this.education = education;
                }

                public String getJobNature() {
                    return jobNature;
                }

                public void setJobNature(String jobNature) {
                    this.jobNature = jobNature;
                }

                public int getPositionId() {
                    return positionId;
                }

                public void setPositionId(int positionId) {
                    this.positionId = positionId;
                }

                public String getCompanyShortName() {
                    return companyShortName;
                }

                public void setCompanyShortName(String companyShortName) {
                    this.companyShortName = companyShortName;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getSalary() {
                    return salary;
                }

                public void setSalary(String salary) {
                    this.salary = salary;
                }

                public int getApprove() {
                    return approve;
                }

                public void setApprove(int approve) {
                    this.approve = approve;
                }

                public String getPositionAdvantage() {
                    return positionAdvantage;
                }

                public void setPositionAdvantage(String positionAdvantage) {
                    this.positionAdvantage = positionAdvantage;
                }

                public String getFinanceStage() {
                    return financeStage;
                }

                public void setFinanceStage(String financeStage) {
                    this.financeStage = financeStage;
                }

                public String getIndustryField() {
                    return industryField;
                }

                public void setIndustryField(String industryField) {
                    this.industryField = industryField;
                }

                public String getCompanySize() {
                    return companySize;
                }

                public void setCompanySize(String companySize) {
                    this.companySize = companySize;
                }

                public int getPublisherId() {
                    return publisherId;
                }

                public void setPublisherId(int publisherId) {
                    this.publisherId = publisherId;
                }

                public String getDistrict() {
                    return district;
                }

                public void setDistrict(String district) {
                    this.district = district;
                }

                public String getCompanyLogo() {
                    return companyLogo;
                }

                public void setCompanyLogo(String companyLogo) {
                    this.companyLogo = companyLogo;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public Object getHitags() {
                    return hitags;
                }

                public void setHitags(Object hitags) {
                    this.hitags = hitags;
                }

                public int getResumeProcessRate() {
                    return resumeProcessRate;
                }

                public void setResumeProcessRate(int resumeProcessRate) {
                    this.resumeProcessRate = resumeProcessRate;
                }

                public int getResumeProcessDay() {
                    return resumeProcessDay;
                }

                public void setResumeProcessDay(int resumeProcessDay) {
                    this.resumeProcessDay = resumeProcessDay;
                }

                public String getCompanyFullName() {
                    return companyFullName;
                }

                public void setCompanyFullName(String companyFullName) {
                    this.companyFullName = companyFullName;
                }

                public String getImState() {
                    return imState;
                }

                public void setImState(String imState) {
                    this.imState = imState;
                }

                public long getLastLogin() {
                    return lastLogin;
                }

                public void setLastLogin(long lastLogin) {
                    this.lastLogin = lastLogin;
                }

                public Object getExplain() {
                    return explain;
                }

                public void setExplain(Object explain) {
                    this.explain = explain;
                }

                public int getAdWord() {
                    return adWord;
                }

                public void setAdWord(int adWord) {
                    this.adWord = adWord;
                }

                public Object getPlus() {
                    return plus;
                }

                public void setPlus(Object plus) {
                    this.plus = plus;
                }

                public int getPcShow() {
                    return pcShow;
                }

                public void setPcShow(int pcShow) {
                    this.pcShow = pcShow;
                }

                public int getAppShow() {
                    return appShow;
                }

                public void setAppShow(int appShow) {
                    this.appShow = appShow;
                }

                public int getDeliver() {
                    return deliver;
                }

                public void setDeliver(int deliver) {
                    this.deliver = deliver;
                }

                public Object getGradeDescription() {
                    return gradeDescription;
                }

                public void setGradeDescription(Object gradeDescription) {
                    this.gradeDescription = gradeDescription;
                }

                public Object getPromotionScoreExplain() {
                    return promotionScoreExplain;
                }

                public void setPromotionScoreExplain(Object promotionScoreExplain) {
                    this.promotionScoreExplain = promotionScoreExplain;
                }

                public String getFirstType() {
                    return firstType;
                }

                public void setFirstType(String firstType) {
                    this.firstType = firstType;
                }

                public String getSecondType() {
                    return secondType;
                }

                public void setSecondType(String secondType) {
                    this.secondType = secondType;
                }

                public int getIsSchoolJob() {
                    return isSchoolJob;
                }

                public void setIsSchoolJob(int isSchoolJob) {
                    this.isSchoolJob = isSchoolJob;
                }

                public String getSubwayline() {
                    return subwayline;
                }

                public void setSubwayline(String subwayline) {
                    this.subwayline = subwayline;
                }

                public String getStationname() {
                    return stationname;
                }

                public void setStationname(String stationname) {
                    this.stationname = stationname;
                }

                public String getLinestaion() {
                    return linestaion;
                }

                public void setLinestaion(String linestaion) {
                    this.linestaion = linestaion;
                }

                public String getFormatCreateTime() {
                    return formatCreateTime;
                }

                public void setFormatCreateTime(String formatCreateTime) {
                    this.formatCreateTime = formatCreateTime;
                }

                public List<String> getCompanyLabelList() {
                    return companyLabelList;
                }

                public void setCompanyLabelList(List<String> companyLabelList) {
                    this.companyLabelList = companyLabelList;
                }

                public List<String> getPositionLables() {
                    return positionLables;
                }

                public void setPositionLables(List<String> positionLables) {
                    this.positionLables = positionLables;
                }

                public List<?> getIndustryLables() {
                    return industryLables;
                }

                public void setIndustryLables(List<?> industryLables) {
                    this.industryLables = industryLables;
                }

                public List<String> getBusinessZones() {
                    return businessZones;
                }

                public void setBusinessZones(List<String> businessZones) {
                    this.businessZones = businessZones;
                }
            }
        }
    }
}

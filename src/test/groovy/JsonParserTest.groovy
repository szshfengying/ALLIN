import cc.lovesq.study.json.JsonParser
import org.junit.Test
import spock.lang.Specification

class JsonParserTest extends Specification {

    def complexJson =
            '''
{"itemStatusModel":{"quotaCycle":17762977,"soldStatus":"SOLD_OUT","risk":{"note":"reprehenderit veniam esse eu","match":false},"periodBuyExtra":{"deliverTime":[-14980787,-30737940,65773231,94272333,-81195370],"description":"ut occaecat non dolore","skuExtras":[{"num":19804785,"skuId":-41715049},{"num":40637385,"skuId":-35032251}],"period":414087},"itemDetailTplStyle":79530713,"itemSalePropList":[{"v":[{"id":-53043840,"price":54389458,"name":"exerci"},{"id":-30477776,"name":"Lorem minim sed ex","price":54627923},{"name":"voluptate consequat pariatur proident","price":-85297167,"id":-45861290},{"price":-76774955,"id":19803043,"name":"in consequat pariatur"},{"id":-91840027,"price":76544845,"name":"nisi"}],"kId":-60326104,"k":"veniam amet e","isMultiple":false},{"isMultiple":false,"k":"repreh","v":[{"id":91444509,"price":74003794,"name":"aliquip nisi"},{"name":"ad","id":-65931348,"price":-34675928}],"kId":-49182986}],"refundModel":{"isSupportRefund":-73709575,"periodMillSeconds":-9728414,"refundType":20599127},"supplierKdtId":30674733,"isInstallment":false,"freeInterest":true,"preSaleInfo":{"balanceDueStart":-73026148,"etdStart":10992903,"maxDeposit":-30610597,"etdType":12623022,"preSaleEnd":48236748,"depositRatio":-76573275,"etdDays":-74306946,"minDeposit":-28491529,"preSaleStart":60240246,"balanceDueEnd":-53220873,"preSaleType":79897894},"quota":63443255,"couponGoodsExtraModel":{"spuExtraModel":{"alias":"est","skuId":-61242204,"preferentialCopywritingDetail":"est aliqua nostrud","validTimeCopywriting":"ullamco irure","couponId":-54479130,"description":"Ut Duis est"},"skuExtraModels":[{"couponId":-94076053,"description":"","alias":"voluptat","validTimeCopywriting":"esse veniam culpa","preferentialCopywritingDetail":"dolore Duis ex","skuId":95770112},{"skuId":36999528,"preferentialCopywritingDetail":"magna cillum in","couponId":71504217,"alias":"ut","description":"dolor aliquip pariatur","validTimeCopywriting":"consequat amet ex tempor"}]},"startSoldTime":-37024739,"abilityMarkCodeList":[80629023,61400479],"fxTradeMode":-79058798,"isDisplay":43401574,"isDisplaySkuPicture":false,"isLock":83225406,"purchaseRight":false,"bizCode":"in laboris sint proident aute","supplierItemId":28537571,"buyWay":-96717933,"messages":[{"multiple":-69935896,"type":"labore ullamco pariatur","name":"sunt incididunt sed ullamco Ut","datetime":-59485871,"required":46236903}],"haoTaoItemExtra":{"tariffRule":46157839,"sourceCountryCode":-17891681,"tariffRate":"do in eiusmod","haiTaoTradeMode":-35152551,"portCode":"consequat quis enim labore","sourceCountryName":"tempor aliqua nos","tariffAmount":"non conse"},"buyUrl":"sed amet ex","virtual":47312342,"itemType":"NORMAL","cateringInfo":{"kdtId":-26446397,"cateringSkuList":[{"isMaxStock":-26834085,"lunchBoxPrice":82280836,"skuId":36501084},{"skuId":-19754021,"lunchBoxPrice":2726237,"isMaxStock":44718474}],"canSoldModelList":[{"createdAt":"consequa","updatedAt":"Ut","id":-40476938,"endAt":"Excepteur dolore Lorem aliquip","startAt":"labore","isDelete":-89814785},{"endAt":"Excepteur eu dolore id proident","updatedAt":"incididunt Excepteur est proident veniam","startAt":"amet ut in ","id":-86018430,"createdAt":"eiusmod","isDelete":79654831},{"startAt":"exercitation ut fugiat","id":-28789102,"endAt":"veniam in enim","updatedAt":"ex cupidatat","createdAt":"do amet magna","isDelete":-17570874}],"itemId":-6549572,"ingredientList":[{"ingredientDetails":[{"price":56018168,"alias":"est velit dolor anim","title":"dolore Lorem cillum exercitation dolore","goodsId":98327180,"skuId":-60573429},{"skuId":-29149645,"title":"est ad nostrud","price":-93302830,"goodsId":1831132,"alias":"ea in Lorem"},{"skuId":-13652768,"alias":"cupidatat","price":-3822166,"goodsId":-77625190,"title":"Ut Excepteur officia"},{"price":7560841,"alias":"est ullamco","goodsId":-55993303,"skuId":-31905510,"title":"proide"}],"ingredientTypeId":-10805233,"ingredientTypeName":"cupidatat tempor","isRadio":-72588427},{"ingredientDetails":[{"goodsId":-27490821,"price":-24743204,"alias":"et aliqua aliquip culpa non","skuId":38410934,"title":"eu do"},{"title":"deserunt reprehenderit in labore","alias":"magna culpa Duis deserunt occaecat","price":-62661854,"skuId":24799745,"goodsId":58664188},{"title":"fugiat","alias":"deserunt incididunt","goodsId":-13784081,"price":14747645,"skuId":4720459},{"skuId":6125495,"price":90670628,"goodsId":32543471,"title":"ad","alias":"cillum Excepteur aliqua"}],"ingredientTypeName":"sit officia labore","isRadio":85957589,"ingredientTypeId":79669249},{"ingredientTypeId":-14561570,"ingredientDetails":[{"goodsId":-74298974,"price":-26464914,"alias":"sit proident aute n","skuId":71743462,"title":"sint"},{"price":54630849,"title":"mollit deserunt eu Ut","alias":"dolor officia","skuId":-51778387,"goodsId":42860882},{"goodsId":39631645,"price":-5692040,"alias":"Ut laborum fugiat veniam","title":"consequat culpa Ut","skuId":-70987516},{"price":-42315021,"title":"quis consectetur culpa","skuId":-4890560,"alias":"elit laboris aute exercitation","goodsId":-86524317}],"ingredientTypeName":"reprehenderit occaecat ullamco dolore","isRadio":-84616048},{"ingredientDetails":[{"alias":"ipsum aliquip laborum in magna","title":"aliquip","goodsId":-23983104,"skuId":69905130,"price":-91575953}],"ingredientTypeId":30249838,"isRadio":-50512521,"ingredientTypeName":"non officia veniam"},{"ingredientDetails":[{"price":-31703001,"title":"minim Ut","goodsId":71774686,"skuId":-60762806,"alias":"aute sunt"},{"alias":"laboris ullamco","skuId":-94883259,"goodsId":12456760,"price":51568997,"title":"commodo magna elit in sed"},{"price":-98036844,"title":"aliqua voluptate","goodsId":15654084,"alias":"ut","skuId":73907527},{"alias":"s","price":-45043444,"title":"enim ad nis","goodsId":6764076,"skuId":60865935}],"ingredientTypeName":"ullamco","isRadio":7919159,"ingredientTypeId":95948537}],"isAllDayCanSold":-72393821},"ecardExtra":{"itemValidityStart":-35260218,"effectiveDelayHours":87477740,"holidaysAvailable":70630530,"itemValidityEnd":61327820,"instructions":"aute dolor non","itemPreOrderTime":"deserunt officia","itemPreOrderTimeStr":"aliquip qui","validityType":-54535640,"itemValidityDay":-45446766,"effectiveType":-79357600},"startSaleNum":36345087},"shopConfigModel":{"itemShopNoteRecommend":"laboris consectetur Ut in tempor","weixinServer":-6457782,"backgroundColor":"consequat","isWebImInOrder":-49296937,"weixinPayOrigin":-50503251,"designSetting":"magna amet dolor","wxAppletOrigin":4653253,"buyRecord":72238130,"teamInit":56127130,"customCartName":"eiusmod nulla ullamco","buyBtnConfig":"sunt commodo dolore sit velit","buyerShow":-92272129,"hideShoppingCart":-66930840,"teamPhysical":-44119718,"showBuyBtn":-49383913,"shopOperateDurationTagUpdateDate":"","showWscWebIm":73404491,"shopOperateDurationTagSwitch":-28667786,"instalment":-78071816,"customerReviews":-93231589,"goodsRecommend":26822014,"isSecuredTransactions":-40522125,"customerBlacklistSwitch":92537822,"guaranteeShowStyleType":-74503886,"teamCertificate":26264184,"isWish":-37420393,"qrCode":73606082,"scrmCreditDiyName":"Excepteur laboris","teamClose":23026457,"weixinOldsub":21905906,"noFansBuy":-5171761,"isGift":29403917,"goodsRecommendForYou":"occaecat quis nisi","showShopBtn":31360060,"isDelete":-51106421,"freightInsurance":-44734794,"paymentSettingOrderMode":"incididunt officia","shopOperateDurationYears":-84552356,"codPay":23014608,"isWebImInGoods":12621201,"isYouzanSecured":76029055,"goodsDetailSales":"minim sit adipisicing Ut est","principalCertType":90944713,"brandCertType":-79016668,"goodsDetailBuyRecord":"in","webImInGoodsConfig":"ullamco dolor irure incididunt sunt"},"itemBasicModel":{"sellPoint":"ut","pictureHeight":-65165311,"soldNum":-40801132,"subTitle":"in nostrud","video":{"videoUrl":"dolore","coverHeight":"laborum sed","coverUrl":"amet in","categoryId":-63816665,"videoName":"ex quis Lorem eiusmod Ut","videoDuration":-86883503,"coverWidth":"enim Lorem est irure","playedCount":-44451855,"videoSize":-20086384,"videoPath":"dolore ali","countPlayedUrl":"incididunt ea in eu culpa","bucketId":16234304,"videoId":-49494159,"status":-57184148,"isPublished":-27920928},"alias":"","origin":"veniam consectetur proident ","id":-19290273,"pictures":[{"width":70657919,"height":-22343252,"id":-10598521,"url":"consequat eu Lorem in"}],"kdtId":-5139550,"title":"et ex"},"deliveryModel":{"postage":{"desc":"exercit","isDelivery":false,"min":-26458011,"max":45210352},"supportSelfFetch":true,"express":{"fee":{"min":-13224130,"max":65024464}},"supportLocalDelivery":true,"supportExpress":false,"deliveryAddress":{"cityName":"sint dolor nulla co","lng":"incididunt consequat id eu","countyName":"m","provinceName":"pariatur laborum velit","lat":"sed cillum"},"localDelivery":{"type":-85614915,"fee":{"min":-50776050,"max":-95382183},"startFee":-80648364}},"skus":{"spuStock":{"stockNum":-98693202,"skuId":-11861325,"isDisable":true,"totalActivityStockNum":-47700877},"props":[{"v":[{"id":-24989618,"name":"labore mollit veniam quis","imgUrl":"Duis sed enim labore ullamco"},{"id":-90476065,"name":"qui in tempor","imgUrl":"id minim labore fugiat nulla"}],"k":"consectetur magna ad","count":82558998,"k_s":"offici","kId":8534998},{"v":[{"id":-64224818,"name":"mollit","imgUrl":"officia culpa consequat"},{"id":21141161,"imgUrl":"ut ad","name":"et exercitation incididunt"}],"k":"eu adipisici","kId":42710719,"k_s":"aliqua labor","count":41138522},{"kId":-65432512,"v":[{"id":-69340162,"imgUrl":"Duis velit nostrud ut esse","name":"ut amet aute deserunt consectetur"},{"id":-5348181,"name":"tempor do deserunt cupidatat","imgUrl":"et ex dolore reprehenderit"}],"k_s":"consectetur nisi ullamco in laboris","count":-76512917,"k":"occaecat sint"}],"skuPrices":[{"price":-81635080,"priceTitle":"dolor labore et dolore magna","recommendedPrice":31397198,"skuId":-20478905},{"recommendedPrice":26416490,"priceTitle":"laboris cillum enim reprehenderit","skuId":81021441,"price":2773660},{"recommendedPrice":-41713258,"price":-45688508,"priceTitle":"incididunt","skuId":84895861}],"hideStock":false,"skuStocks":[{"isDisable":true,"skuId":33309296,"stockNum":53234689,"totalActivityStockNum":-4660057},{"totalActivityStockNum":95298430,"skuId":-30403666,"stockNum":17034381,"isDisable":true},{"stockNum":59339675,"totalActivityStockNum":95219603,"skuId":-80795034,"isDisable":false},{"stockNum":-67632825,"totalActivityStockNum":93876322,"isDisable":false,"skuId":85348634}],"spuPrice":{"recommendedPrice":-17655292,"skuId":77302426,"price":96639266,"priceTitle":"aliqua Ut qui ut"},"skus":[{"s3":"mollit officia sint cillum in","s5":"enim dolor","skuId":-51209258,"s4":"sint","s1":"Ut voluptate amet quis","s2":"ad labore sed ut non"},{"s4":"ullamco ex ea laborum Duis","s5":"occaecat","s3":"cupidatat deserunt exercitation","s1":"est velit in","s2":"deserunt exercitation sed nisi","skuId":18519700},{"s1":"elit","s3":"in esse non reprehenderit","skuId":-52832520,"s2":"adipisicing","s5":"dolor","s4":"occaecat"},{"s2":"Duis proident","skuId":60466947,"s1":"ullamco Excepteur laboris ut ea","s3":"minim in et","s4":"cupidatat","s5":"amet eu Excepteur"}]}}
            '''

    @Test
    def "testParseJson"() {
        when:
        def json = '''{"note":"haha","match":false, "extra": {"price": 1.0, "num":5}, "list":["i", "have", "a", "dream"],
                        "skus":[{"id":-30477776,"name":"Lorem minim sed ex","price":54627923}]}'''

        new JsonParser().parse(complexJson)
        then:
        1==1
    }


}



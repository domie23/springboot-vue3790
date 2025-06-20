
var projectName = '生鲜交易系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '生鲜信息',
	url: './pages/shengxianxinxi/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootcug86/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除","审核","查看评论"],"menu":"生鲜信息","menuJump":"列表","tableName":"shengxianxinxi"}],"menu":"生鲜信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"生鲜分类","menuJump":"列表","tableName":"shengxianfenlei"}],"menu":"生鲜分类管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除","审核","查看评论"],"menu":"广告信息","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","删除"],"menu":"生鲜仓库","menuJump":"列表","tableName":"shengxiancangku"}],"menu":"生鲜仓库管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","删除"],"menu":"生鲜出库","menuJump":"列表","tableName":"shengxianchuku"}],"menu":"生鲜出库管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"用户警告","menuJump":"列表","tableName":"yonghujinggao"}],"menu":"用户警告管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"商家警告","menuJump":"列表","tableName":"shangjiajinggao"}],"menu":"商家警告管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"生鲜信息列表","menuJump":"列表","tableName":"shengxianxinxi"}],"menu":"生鲜信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除"],"menu":"用户警告","menuJump":"列表","tableName":"yonghujinggao"}],"menu":"用户警告管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"生鲜信息列表","menuJump":"列表","tableName":"shengxianxinxi"}],"menu":"生鲜信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除","查看评论"],"menu":"生鲜信息","menuJump":"列表","tableName":"shengxianxinxi"}],"menu":"生鲜信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除","查看评论"],"menu":"广告信息","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除","出库"],"menu":"生鲜仓库","menuJump":"列表","tableName":"shengxiancangku"}],"menu":"生鲜仓库管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除"],"menu":"生鲜出库","menuJump":"列表","tableName":"shengxianchuku"}],"menu":"生鲜出库管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","删除"],"menu":"商家警告","menuJump":"列表","tableName":"shangjiajinggao"}],"menu":"商家警告管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除","物流"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-copy","buttons":["查看","删除","物流"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除","发货","物流"],"menu":"已支付订单","tableName":"orders/已支付"},{"appFrontIcon":"cuIcon-vip","buttons":["删除","查看","物流"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"生鲜信息列表","menuJump":"列表","tableName":"shengxianxinxi"}],"menu":"生鲜信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"商家","tableName":"shangjia"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

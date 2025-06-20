import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import shengxiancangku from '@/views/modules/shengxiancangku/list'
    import discussguanggaoxinxi from '@/views/modules/discussguanggaoxinxi/list'
    import discussshengxianxinxi from '@/views/modules/discussshengxianxinxi/list'
    import shengxianfenlei from '@/views/modules/shengxianfenlei/list'
    import shangjia from '@/views/modules/shangjia/list'
    import shangjiajinggao from '@/views/modules/shangjiajinggao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shengxianxinxi from '@/views/modules/shengxianxinxi/list'
    import guanggaoxinxi from '@/views/modules/guanggaoxinxi/list'
    import orders from '@/views/modules/orders/list'
    import shengxianchuku from '@/views/modules/shengxianchuku/list'
    import yonghujinggao from '@/views/modules/yonghujinggao/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/shengxiancangku',
        name: '生鲜仓库',
        component: shengxiancangku
      }
      ,{
	path: '/discussguanggaoxinxi',
        name: '广告信息评论',
        component: discussguanggaoxinxi
      }
      ,{
	path: '/discussshengxianxinxi',
        name: '生鲜信息评论',
        component: discussshengxianxinxi
      }
      ,{
	path: '/shengxianfenlei',
        name: '生鲜分类',
        component: shengxianfenlei
      }
      ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
      ,{
	path: '/shangjiajinggao',
        name: '商家警告',
        component: shangjiajinggao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shengxianxinxi',
        name: '生鲜信息',
        component: shengxianxinxi
      }
      ,{
	path: '/guanggaoxinxi',
        name: '广告信息',
        component: guanggaoxinxi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/shengxianchuku',
        name: '生鲜出库',
        component: shengxianchuku
      }
      ,{
	path: '/yonghujinggao',
        name: '用户警告',
        component: yonghujinggao
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

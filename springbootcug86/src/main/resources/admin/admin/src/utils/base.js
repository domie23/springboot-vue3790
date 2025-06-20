const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootcug86/",
            name: "springbootcug86",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootcug86/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "生鲜交易系统"
        } 
    }
}
export default base

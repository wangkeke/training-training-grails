class BootStrap {
    /**
     * 项目启动前预处理
     */
    def init = { servletContext ->
        // 下面都是自定义一些环境
        environments {
            development {

            }
            production {

            }
        }
        // 这个是我自定义测试一个变量
        servletContext.setAttribute("testParam", "这个是测试的属性")
    }
    def destroy = {
    }
}

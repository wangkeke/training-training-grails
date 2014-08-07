/**
 * 指定Servlet版本
 */
grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
/**
 * 编译后的文件位置
 */
grails.project.class.dir = "target/classes"
/**
 * 测试文件编译后的位置
 */
grails.project.test.class.dir = "target/test-classes"
/**
 * 测试报告文件位置
 */
grails.project.test.reports.dir = "target/test-reports"
/**
 * 临时编译后的文件位置
 */
grails.project.work.dir = "target/work"
/**
 * 编译后字节码的兼容版本
 */
grails.project.target.level = 1.6
/**
 * 编译时源码兼容版本
 */
grails.project.source.level = 1.6

/**
 * 默认使用application.properties
 * 需要注意的是默认把Properties文件的"."转成驼峰
 */
grails.project.war.file = "target/${appName}-${appVersion}.war"

/**
 * 是否准许离线运行 grails --offline run-app
 */
grails.offline.mode = true

/**
 * 项目编译时环境分支
 */
grails.project.fork = [
        // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
        //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

        // configure settings for the test-app JVM, uses the daemon by default
        /**
         * 测试环境分支
         */
        test   : [maxMemory: 768, minMemory: 64, debug: true, maxPerm: 256, daemon: true],
        // configure settings for the run-app JVM
        /**
         * 运行时环境分支
         */
        run    : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve: false],
        // configure settings for the run-war JVM
        /**
         * 打包时候环境分支
         */
        war    : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve: false],
        // configure settings for the Console UI JVM
        console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

/**
 * 构建环境--默认是Maven
 */
grails.project.dependency.resolver = "maven" // or ivy

/**
 * 依赖管理
 */
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false
    // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    /**
     * 软件源仓库配置
     */
    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        /**
         * 以下是默认的三个仓库中心，也可以如下配置：
         * mavenRepo name: "Codehaus", root: "http://repository.codehaus.org"
         */
        mavenRepo "http://repository.codehaus.org"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"
        /**
         * 指定公司Maven中心仓库
         */
        mavenRepo "http://nexus.sp.cn/nexus/content/groups/public/"
        /**
         * 指定公司Plugins中心仓库
         */
        grailsRepo "http://nexus.sp.cn/nexus/content/repositories/plugins.grails.org/"
    }

    /**
     * 依赖管理配置
     */
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.
        // runtime 'mysql:mysql-connector-java:5.1.29'
        // runtime 'org.postgresql:postgresql:9.3-1101-jdbc41'
        // compile "org.springframework:spring-orm:$springVersion"
        compile "org.springframework:spring-orm:4.0.5.RELEASE"
    }

    /**
     * 插件依赖管理
     */
    plugins {
        // plugins for the build system only
        build ":tomcat:7.0.53"

        // plugins for the compile step
        compile ":scaffolding:2.1.0"
        compile ':cache:1.1.6'
        compile ":asset-pipeline:1.8.7"

        // plugins needed at runtime but not for compilation
        runtime ":hibernate4:4.3.5.3" // or ":hibernate:3.6.10.15"
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.1"

        // Uncomment these to enable additional asset-pipeline capabilities
        //compile ":sass-asset-pipeline:1.7.4"
        //compile ":less-asset-pipeline:1.7.0"
        //compile ":coffee-asset-pipeline:1.7.0"
        //compile ":handlebars-asset-pipeline:1.3.0.3"
    }
}

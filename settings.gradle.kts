pluginManagement {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()

        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/google") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/groups/public") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/jcenter")}
        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
        maven {
            credentials {
                username="654f4d888f25556ebb4ed790"
                password="OsVOuR6WZFK="
            }
            setUrl("https://packages.aliyun.com/maven/repository/2433389-release-RMv0jP/")
        }
        maven {
            credentials {
                username="654f4d888f25556ebb4ed790"
                password="OsVOuR6WZFK="
            }
            setUrl("https://packages.aliyun.com/maven/repository/2433389-snapshot-Kqt8ID/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/google") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/groups/public") }
        maven { setUrl("https://maven.aliyun.com/nexus/content/repositories/jcenter")}
        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
        maven {
            credentials {
                username="654f4d888f25556ebb4ed790"
                password="OsVOuR6WZFK="
            }
            setUrl("https://packages.aliyun.com/maven/repository/2433389-release-RMv0jP/")
        }
        maven {
            credentials {
                username="654f4d888f25556ebb4ed790"
                password="OsVOuR6WZFK="
            }
            setUrl("https://packages.aliyun.com/maven/repository/2433389-snapshot-Kqt8ID/")
        }
    }
}

rootProject.name = "json-benchmark"
include(":app")
include(":benchmark")

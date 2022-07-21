job("Warmup data for PyCharm") {
    startOn {
        gitPush {
            branchFilter {
                +"refs/heads/master"
            }
        }
    }
    warmup(ide = Ide.PyCharm) {
        scriptLocation = "./dev-env-warmup.sh"
        ideVersion = IdeVersion.LatestOfQuality("Nightly")
        devfile = ".space/devfile.yaml"
    }
}

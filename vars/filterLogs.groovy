  
#!/usr/bin/env groovy

def call(String filter_string, int occurrence) {
    def logs = currentBuild.rawBuild.getLog(10000).join('\n')
    int count = StringUtils.countMatches(logs, filter_string);
    if (count > occurrence -1) {
        currentBuild.result='UNSTABLE'
    }
}

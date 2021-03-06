package org.rundeck.plugin.scm.git

import com.dtolabs.rundeck.plugins.scm.ImportSynchState
import com.dtolabs.rundeck.plugins.scm.JobImportState
import com.dtolabs.rundeck.plugins.scm.ScmCommitInfo

/**
 * Created by greg on 9/14/15.
 */
class JobImportGitState implements JobImportState {
    ImportSynchState synchState

    ScmCommitInfo commit


    @Override
    public String toString() {
        return "JobImportGitState{" +
                "state=" + synchState +
                ", commit=" + commit +
                '}';
    }
}

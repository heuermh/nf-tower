/*
 * Copyright (c) 2019, Seqera Labs.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 */

package io.seqera.tower.service

import io.seqera.tower.domain.Workflow
import io.seqera.tower.exchange.progress.ProgressData
import io.seqera.tower.exchange.workflow.GetWorkflowResponse

interface ProgressService {

    ProgressData computeWorkflowProgress(String workflowId)

    GetWorkflowResponse buildWorkflowGet(Workflow workflow)

    ProgressData fetchWorkflowProgress(Workflow workflow)

    void updateLoadPeaks(Workflow workflow)

}

package org.lamisplus.modules.dbbackup.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lamisplus.modules.dbbackup.config.ContextProvider;
import org.lamisplus.modules.dbbackup.service.BackupService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@Slf4j
@RequiredArgsConstructor
public class BackupJob  {

//    implements Job
//    @Override
//    public void execute(JobExecutionContext context) throws JobExecutionException {
//        log.debug("Running backup job...");
//        BackupService backupService = ContextProvider.getBean(BackupService.class);
//        backupService.backupPGSQL(false);
//        backupService.cleanupBackup();
//    }
}

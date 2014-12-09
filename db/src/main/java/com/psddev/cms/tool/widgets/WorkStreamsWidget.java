package com.psddev.cms.tool.widgets;

import com.psddev.cms.db.Content;
import com.psddev.cms.tool.Dashboard;
import com.psddev.cms.tool.ToolPageContext;
import com.psddev.cms.tool.page.WorkStreams;

import javax.servlet.ServletException;
import java.io.IOException;

public class WorkStreamsWidget extends Content implements CmsWidget {

    @Override
    public void writeHtml(ToolPageContext page, Dashboard dashboard) throws IOException, ServletException {
        WorkStreams.reallyDoService(page);
    }
}

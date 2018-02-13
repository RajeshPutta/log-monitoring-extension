/*
 *  Copyright 2014. AppDynamics LLC and its affiliates.
 *  All Rights Reserved.
 *  This is unpublished proprietary source code of AppDynamics LLC and its affiliates.
 *  The copyright notice above does not evidence any actual or intended publication of such source code.
 *
 */

package com.appdynamics.extensions.logmonitor;

import java.util.regex.Pattern;

/**
 * @author Satish Muddam
 */
public class SearchPattern {

    private String displayName;
    private Pattern pattern;
    private Boolean caseSensitive;
    private Boolean printMatchedString;
    private Boolean sendEventToController;

    public SearchPattern(String displayName, Pattern pattern, Boolean caseSensitive, Boolean printMatchedString,
                         Boolean sendEventToController) {
        this.displayName = displayName;
        this.pattern = pattern;
        this.caseSensitive = caseSensitive;
        this.printMatchedString = printMatchedString;
        this.sendEventToController = sendEventToController;
    }

    public String getDisplayName() {
        return displayName;
    }
    Boolean getCaseSensitive() {
        return caseSensitive;
    }
    public Pattern getPattern() {
        return pattern;
    }
    Boolean getPrintMatchedString() { return printMatchedString; }
    Boolean getSendEventToController() { return sendEventToController;}

}

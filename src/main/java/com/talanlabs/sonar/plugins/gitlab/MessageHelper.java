/*
 * SonarQube :: GitLab Plugin
 * Copyright (C) 2016-2025 Talanlabs
 * gabriel.allaigre@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Sonar Source-Available License Version 1, as published by SonarSource SA.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Sonar Source-Available License for more details.
 *
 * You should have received a copy of the Sonar Source-Available License
 * along with this program; if not, see https://sonarsource.com/license/ssal/
 */
package com.talanlabs.sonar.plugins.gitlab;

public class MessageHelper {

    public static final String FAILED_GITLAB_STATUS = "failed";
    public static final String SUCCESS_GITLAB_STATUS = "success";

    private MessageHelper() {
        // Nothing
    }

    public static String sonarQubeFailed(String message) {
        return String.format("SonarQube failed to complete the review of this commit: %s", message);
    }

}

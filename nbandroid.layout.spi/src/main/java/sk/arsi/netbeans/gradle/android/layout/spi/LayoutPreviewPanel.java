/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package sk.arsi.netbeans.gradle.android.layout.spi;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author arsi
 */
public abstract class LayoutPreviewPanel extends JPanel {

    protected final File platformFolder;
    protected final File layoutFile;
    protected final File appResFolder;
    protected final String themeName;
    protected final List<File> aars;
    protected final List<File> jars;
    protected final File projectClassesFolder;
    protected final File projectR;
    protected final String appPackage;

    public LayoutPreviewPanel(File platformFolder, File layoutFile, File appResFolder, String themeName, List<File> aars, List<File> jars, File projectClassesFolder, File projectR, String appPackage) {
        this.platformFolder = platformFolder;
        this.layoutFile = layoutFile;
        this.appResFolder = appResFolder;
        this.themeName = themeName;
        this.aars = aars;
        this.jars = jars;
        this.projectClassesFolder = projectClassesFolder;
        this.projectR = projectR;
        this.appPackage = appPackage;
    }

    public LayoutPreviewPanel() {
        this.platformFolder = null;
        this.layoutFile = null;
        this.appResFolder = null;
        this.themeName = null;
        this.aars = null;
        this.jars = null;
        this.projectClassesFolder = null;
        this.projectR = null;
        this.appPackage = null;
    }

    public abstract void refreshPreview(InputStream stream);

    public abstract void showTypingIndicator();

}

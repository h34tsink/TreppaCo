Intellij IDEA IDE for Mod-Development.

First, you are going to need to download the Forge-Source ("Src") package from http://files.minecraftforge.net/ and unzip it.

If you are using Intellij 14 or later you need to add the following to the end of your build.gradle before importing:
idea { module { inheritOutputDirs = true } }
If you don't do that, your assets will not work. (Thanks to SanAndreasP for finding this solution)

Next, start up Intellij. If you already have a Project opened, select File > Open, otherwise select "Open Project". Navigate to the directory where you unzipped Forge to and select the
build.gradle
file. Leave the import-settings at default and click OK.
Intellij will now take a while to import the project. Once that's done, open the Gradle-sidebar.
If the sidebar is not visible, click the view-switcher in the bottom-left corner: oeiuGXW.png

Select the
setupDecompWorkspace
task from the list and run it (double-click). If you don't need the Minecraft source code visible, run
setupDevWorkspace
instead, it will be faster.
Once the task has finished, click the Refresh button in the Gradle-sidebar. That will again take a moment. Once Intellij has finished refreshing, your project is already almost ready to go. You should be able to see all the libraries used by Forge & Minecraft on the left and also the source code for the ExampleMod inside
src/main/java
.

All that is left to do are the run configurations, so that you can actually start Minecraft. For those again open the Gradle sidebar and run the
genIntellijRuns
task. Intellij will now ask to reload the project, click OK.

In most recent versions of IntelliJ you now have to go into Run > Edit Configurations and adjust both run configurations like shown below.
http://i.imgur.com/49qpav0.png

That's it!
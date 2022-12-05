package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the callback function that will be called once the
 * external plugin installer program has returned. You only need to provide
 * a callback function if you are using the asynchronous interface.
 */
@FunctionalInterface
public interface InstallPluginsResultFunc {
        void onInstallPluginsResultFunc(@NotNull org.gstreamer.pbutils.InstallPluginsReturn result);
}

package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * When loading the partial contents of a file with g_file_load_partial_contents_async(),
 * it may become necessary to determine if any more data from the file should be loaded.
 * A {@link FileReadMoreCallback} function facilitates this by returning {@code true} if more data
 * should be read, or {@code false} otherwise.
 */
@FunctionalInterface
public interface FileReadMoreCallback {
        boolean onFileReadMoreCallback(@NotNull java.lang.String fileContents, long fileSize);
}

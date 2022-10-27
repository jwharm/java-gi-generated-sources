package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that is passed to
 * gtk_print_run_page_setup_dialog_async().
 * <p>
 * This function will be called when the page setup dialog
 * is dismissed, and also serves as destroy notify for {@code data}.
 */
@FunctionalInterface
public interface PageSetupDoneFunc {
        void onPageSetupDoneFunc(@NotNull org.gtk.gtk.PageSetup pageSetup);
}

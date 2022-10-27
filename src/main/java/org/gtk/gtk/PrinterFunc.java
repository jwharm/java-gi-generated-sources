package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function passed to gtk_enumerate_printers().
 * <p>
 * Note that you need to ref {@code printer}, if you want to keep
 * a reference to it after the function has returned.
 */
@FunctionalInterface
public interface PrinterFunc {
        boolean onPrinterFunc(@NotNull org.gtk.gtk.Printer printer);
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type used for test case functions that take an extra pointer
 * argument.
 */
@FunctionalInterface
public interface TestDataFunc {
        void onTestDataFunc();
}

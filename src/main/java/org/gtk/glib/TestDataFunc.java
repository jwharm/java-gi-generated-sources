package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for test case functions that take an extra pointer
 * argument.
 * @version 2.28
 */
@FunctionalInterface
public interface TestDataFunc {
        void onTestDataFunc();
}

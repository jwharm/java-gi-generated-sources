package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of file to return the filename for, when used with
 * g_test_build_filename().
 * <p>
 * These two options correspond rather directly to the 'dist' and
 * 'built' terminology that automake uses and are explicitly used to
 * distinguish between the 'srcdir' and 'builddir' being separate.  All
 * files in your project should either be dist (in the
 * {@code EXTRA_DIST} or {@code dist_schema_DATA}
 * sense, in which case they will always be in the srcdir) or built (in
 * the {@code BUILT_SOURCES} sense, in which case they will
 * always be in the builddir).
 * <p>
 * Note: as a general rule of automake, files that are generated only as
 * part of the build-from-git process (but then are distributed with the
 * tarball) always go in srcdir (even if doing a srcdir != builddir
 * build from git) and are considered as distributed files.
 * @version 2.38
 */
public enum TestFileType implements io.github.jwharm.javagi.Enumeration {
    /**
     * a file that was included in the distribution tarball
     */
    DIST(0),
    /**
     * a file that was built on the compiling machine
     */
    BUILT(1);
    
    private static final java.lang.String C_TYPE_NAME = "GTestFileType";
    
    private final int value;
    TestFileType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TestFileType of(int value) {
        return switch (value) {
            case 0 -> DIST;
            case 1 -> BUILT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}

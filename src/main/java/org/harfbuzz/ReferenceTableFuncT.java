package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback function for hb_face_create_for_tables().
 * @version 0.9.2
 */
@FunctionalInterface
public interface ReferenceTableFuncT {
        org.harfbuzz.BlobT onReferenceTableFuncT(@NotNull org.harfbuzz.FaceT face, @NotNull org.harfbuzz.TagT tag, @Nullable java.lang.foreign.MemoryAddress userData);
}

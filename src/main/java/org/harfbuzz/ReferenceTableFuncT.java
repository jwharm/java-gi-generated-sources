package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Callback function for hb_face_create_for_tables().
 */
@FunctionalInterface
public interface ReferenceTableFuncT {
        BlobT onReferenceTableFuncT(@NotNull FaceT face, @NotNull TagT tag, @Nullable java.lang.foreign.MemoryAddress userData);
}

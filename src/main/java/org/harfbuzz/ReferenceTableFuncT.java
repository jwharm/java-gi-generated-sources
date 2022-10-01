package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * Callback function for hb_face_create_for_tables().
 */
@FunctionalInterface
public interface ReferenceTableFuncT {
        BlobT onReferenceTableFuncT(FaceT face, TagT tag, java.lang.foreign.MemoryAddress userData);
}

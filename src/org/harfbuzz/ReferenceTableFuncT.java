package org.harfbuzz;

/**
 * Callback function for hb_face_create_for_tables().
 */
@FunctionalInterface
public interface ReferenceTableFuncT {
        BlobT onReferenceTableFuncT(FaceT face, TagT tag, jdk.incubator.foreign.MemoryAddress userData);
}

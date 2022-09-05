package org.harfbuzz;

@FunctionalInterface
public interface ReferenceTableFuncT {

    /**
     * Callback function for hb_face_create_for_tables().
     */
    public BlobT onReferenceTableFuncT(FaceT face, TagT tag, jdk.incubator.foreign.MemoryAddress userData);
}

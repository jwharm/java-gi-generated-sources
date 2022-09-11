package org.gtk.gtk;

@FunctionalInterface
public interface PrintJobCompleteFunc {

        void onPrintJobCompleteFunc(PrintJob printJob, jdk.incubator.foreign.MemoryAddress userData);
}

// (c) Facebook, Inc. and its affiliates. Confidential and proprietary.

package org.pytorch;

interface INativePeer {
  void resetNative();

  IValue forward(IValue... inputs);

  IValue runMethod(String methodName, IValue... inputs);

  void setNumThreads(int numThreads);
}

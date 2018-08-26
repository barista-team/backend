package org.barista.backend.operations

trait ShapeOps[NArray] {
  /**
    * Concatenates a list of tensors alongside the specified axis.
    *
    * @param tensors
    * @param axis
    * @return
    */
  def concatenate(tensors: List[NArray], axis: Int = -1): NArray = ???

  /**
    * Reshapes a tensor to the specified shape.
    *
    * @param x
    * @param shape
    * @return
    */
  def reshape(x: NArray, shape: List[Int]): NArray = ???

  /**
    * Repeats a tensor.
    *
    * @param x
    * @param n
    * @return
    */
  def repeat(x: NArray, n: Int): NArray = ???

  /**
    * Flatten a tensor.
    *
    * @param x
    * @return
    */
  def flatten(x: NArray): NArray = ???

  /**
    * One hot encoding of a tensor.
    *
    * @param x
    */
  def oneHot(x: NArray): NArray = ???


}

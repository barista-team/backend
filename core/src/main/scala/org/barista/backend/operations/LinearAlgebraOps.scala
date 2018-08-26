package org.barista.backend.operations

trait LinearAlgebraOps[NArray] {

  /** Dot product of two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  def dot(x: NArray, y: NArray): NArray = ???

  /** Batchwise dot product.
    *
    * Example;
    * Assume `x = [[1, 2], [3, 4]]` and `y = [[5, 6], [7, 8]]`
    * `batch_dot(x, y, axes=1) = [[17, 53]]` which is the main diagonal
    * of `x.dot(y.T)`, although we never have to calculate the off-diagonal
    * elements.
    *
    * @param x
    * @param y
    * @return
    */
  def batchDot(x: NArray, y: NArray, axes: List[Int] = List.empty): NArray = ???

  /**
    * Transposes a tensor and returns it.
    *
    * @param x
    * @return
    */
  def transpose(x: NArray): NArray = ???

  /**
    * Instantiates an all-zeros variable and returns it.
    *
    * @param shape
    * @param name
    */
  def zeros[T](shape: List[Int], name: Option[String] = None): NArray = ???


  /**
    * Instantiates an all-ones variable and returns it.
    *
    * @param shape
    * @param name
    */
  def ones[T](shape: List[Int], name: Option[String] = None): NArray = ???

  /**
    * Instantiate an identity matrix and returns it.
    *
    * @param shape
    * @param name
    */
  def eye[T](shape: List[Int], name: Option[String] = None): NArray = ???


}

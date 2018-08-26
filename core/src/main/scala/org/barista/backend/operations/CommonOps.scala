package org.barista.backend.operations


trait CommonOps[NArray] extends LinearAlgebraOps[NArray]
  with ElementWiseOps[NArray]
  with ShapeOps[NArray] {

  def isSparse(tensor: NArray): Boolean = ???

  /**
    * Converts a sparse tensor into a dense tensor and returns it.
    *
    * @param tensor
    * @return
    */
  def toDense(tensor: NArray): NArray = ???

  /**
    * Creates a constant tensor.
    *
    * @param value
    * @param shape
    * @param name
    * @tparam T
    * @return
    */
  def constant[T](value: T, shape: List[Int], name: Option[String] = None): NArray = ???

  /**
    * Instantiates a placeholder tensor and returns it.
    *
    * @param shape
    * @param sparse
    * @param name
    * @tparam T
    * @return
    */
  def placeHolder[T](shape: List[Int], sparse: Boolean = false, name: Option[String] = None): NArray = ???

  /**
    * Instantiates a variable with values drawn from a uniform distribution.
    *
    * @param shape
    * @param low  Lowest value in the distribution
    * @param high Highest value in the distribution
    * @param seed random seed
    * @param name
    * @tparam T
    * @return
    */
  def randomUniformVariable[T](shape: List[Int],
                               low: T,
                               high: T,
                               seed: Option[Int] = None,
                               name: Option[String] = None): NArray = ???

  /**
    * Instantiates a variable with values drawn from a uniform distribution.
    *
    * @param shape
    * @param mean  Mean of the distribution
    * @param scale Standard deviation of the distribution
    * @param seed  random seed
    * @param name
    * @tparam T
    * @return
    */
  def randomNormalVariable[T](shape: List[Int],
                              mean: T,
                              scale: T,
                              seed: Option[Int] = None,
                              name: Option[String] = None): NArray = ???

  /**
    * Returns the number of scalars in a tensor variable.
    *
    * @return
    */
  def countParams(tensor: NArray): Int = ???

  /**
    * Applies batch normalization on x given mean, var, beta and gamma.
    * `output = (x - mean) / (sqrt(var) + epsilon) * gamma + beta`
    *
    * @param x        Input tensor or variable.
    * @param mean     Mean of the bacth
    * @param variance Variance of the batch
    * @param gamma    Tensor by which to scale the input.
    * @param beta     Tensor with which to center the input.
    * @param epsilon  Fuzz factor.
    * @tparam T Type of the NArray
    * @return
    */
  def batchNormalization[T](x: NArray, mean: T, variance: T, gamma: NArray, beta: NArray, epsilon: Double = .003): NArray = ???

  /**
    * Computes mean and std for batch then apply batch_normalization on batch.
    *
    * @param x             Input tensor or variable.
    * @param gamma         Tensor by which to scale the input.
    * @param beta          Tensor with which to center the input.
    * @param reductionAxes Axes over which to normalize.
    * @param epsilon       Fuzz factor.
    * @return
    */
  def normalizeBatchInTraining(x: NArray, gamma: NArray, beta: NArray, reductionAxes: List[Int], epsilon: Double = .003): NArray = ???

}

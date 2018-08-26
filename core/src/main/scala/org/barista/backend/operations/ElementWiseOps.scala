package org.barista.backend.operations

trait ElementWiseOps[NArray] {

  def max(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  def min(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  def sum(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  /**
    * Logical OR along the axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  def any(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  /**
    * Logical AND along the axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  def all(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  def product(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  /**
    * Variance of a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  def variance(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  /**
    * Standard Deviation of a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  def standardDeviation(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  /**
    * Mean of a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  def mean(x: NArray, axis: Option[Int] = None, keepDimensions: Boolean = false): NArray = ???

  /**
    * Cumulative sum of the values in a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @return
    */
  def cumulativeSum(x: NArray, axis: Option[Int] = None): NArray = ???

  /**
    * Cumulative sum of the values in a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @return
    */
  def cumulativeProduct(x: NArray, axis: Option[Int] = None): NArray = ???

  /**
    * Element-wise square.
    *
    * @param x
    * @return
    */
  def square(x: NArray): NArray = ???

  /**
    * Element-wise absolute value.
    *
    * @param x
    * @return
    */
  def abs(x: NArray): NArray = ???

  /**
    * Element-wise square-root.
    *
    * @param x
    * @return
    */
  def sqrt(x: NArray): NArray = ???


  /**
    * Element-wise log.
    *
    * @param x
    * @return
    */
  def log(x: NArray): NArray = ???


  /**
    * Element-wise exponential.
    *
    * @param x
    * @return
    */
  def exp(x: NArray): NArray = ???


  /**
    * Element-wise round.
    *
    * @param x
    * @return
    */
  def round(x: NArray): NArray = ???


  /**
    * Element-wise sign.
    *
    * @param x
    * @return
    */
  def sign(x: NArray): NArray = ???


  /**
    * Element-wise sin.
    *
    * @param x
    * @return
    */
  def sin(x: NArray): NArray = ???

  /**
    * Element-wise cos.
    *
    * @param x
    * @return
    */
  def cos(x: NArray): NArray = ???

  /**
    * Element-wise power.
    *
    * @param x
    * @param power
    * @return
    */
  def pow(x: NArray, power: Int): NArray = ???

  /**
    * Element-wise clipping.
    *
    * @param x
    * @param minValue
    * @param maxValue
    * @tparam T
    * @return
    */
  def clip[T](x: NArray, minValue: T, maxValue: T): NArray = ???


  /**
    * Element-wise inequality between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  def notEquals(x: NArray, y: NArray): Boolean = ???

  /**
    * Element-wise equality between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  def equals(x: NArray, y: NArray): Boolean = !notEquals(x, y)

  /**
    * Element-wise truth value of (x < y).
    *
    * @param x
    * @param y
    * @return
    */
  def lt(x: NArray, y: NArray): Boolean = ???

  /**
    * Element-wise truth value of (x <= y).
    *
    * @param x
    * @param y
    * @return
    */
  def lte(x: NArray, y: NArray): Boolean = ???

  /**
    * Element-wise truth value of (x > y).
    *
    * @param x
    * @param y
    * @return
    */
  def gt(x: NArray, y: NArray): Boolean = ???

  /**
    * Element-wise truth value of (x >= y).
    *
    * @param x
    * @param y
    * @return
    */
  def gte(x: NArray, y: NArray): Boolean = ???

  /**
    * Element-wise minimum between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  def minimum(x: NArray, y: NArray): Boolean = ???

  /**
    * Element-wise maximum between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  def maximum(x: NArray, y: NArray): Boolean = ???


}

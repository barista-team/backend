package org.barista.backend.operations

import org.apache.mxnet._

trait MXNetElementWiseOps extends ElementWiseOps[NDArray] {
  override def max(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = {
    Symbol.Variable("data")
  }

  override def min(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.min(x, axis, keepDimensions)

  override def sum(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.sum(x, axis, keepDimensions)

  /**
    * Logical OR along the axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  override def any(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.any(x, axis, keepDimensions)

  /**
    * Logical AND along the axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  override def all(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.all(x, axis, keepDimensions)

  override def product(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.product(x, axis, keepDimensions)

  /**
    * Variance of a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  override def variance(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.variance(x, axis, keepDimensions)

  /**
    * Standard Deviation of a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  override def standardDeviation(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.standardDeviation(x, axis, keepDimensions)

  /**
    * Mean of a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @param keepDimensions
    * @return
    */
  override def mean(x: NDArray, axis: Option[Int], keepDimensions: Boolean): NDArray = super.mean(x, axis, keepDimensions)

  /**
    * Cumulative sum of the values in a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @return
    */
  override def cumulativeSum(x: NDArray, axis: Option[Int]): NDArray = super.cumulativeSum(x, axis)

  /**
    * Cumulative sum of the values in a tensor, alongside the specified axis.
    *
    * @param x
    * @param axis
    * @return
    */
  override def cumulativeProduct(x: NDArray, axis: Option[Int]): NDArray = super.cumulativeProduct(x, axis)

  /**
    * Element-wise square.
    *
    * @param x
    * @return
    */
  override def square(x: NDArray): NDArray = super.square(x)

  /**
    * Element-wise absolute value.
    *
    * @param x
    * @return
    */
  override def abs(x: NDArray): NDArray = super.abs(x)

  /**
    * Element-wise square-root.
    *
    * @param x
    * @return
    */
  override def sqrt(x: NDArray): NDArray = super.sqrt(x)

  /**
    * Element-wise log.
    *
    * @param x
    * @return
    */
  override def log(x: NDArray): NDArray = super.log(x)

  /**
    * Element-wise exponential.
    *
    * @param x
    * @return
    */
  override def exp(x: NDArray): NDArray = super.exp(x)

  /**
    * Element-wise round.
    *
    * @param x
    * @return
    */
  override def round(x: NDArray): NDArray = super.round(x)

  /**
    * Element-wise sign.
    *
    * @param x
    * @return
    */
  override def sign(x: NDArray): NDArray = super.sign(x)

  /**
    * Element-wise sin.
    *
    * @param x
    * @return
    */
  override def sin(x: NDArray): NDArray = super.sin(x)

  /**
    * Element-wise cos.
    *
    * @param x
    * @return
    */
  override def cos(x: NDArray): NDArray = super.cos(x)

  /**
    * Element-wise power.
    *
    * @param x
    * @param power
    * @return
    */
  override def pow(x: NDArray, power: Int): NDArray = super.pow(x, power)

  /**
    * Element-wise clipping.
    *
    * @param x
    * @param minValue
    * @param maxValue
    * @tparam T
    * @return
    */
  override def clip[T](x: NDArray, minValue: T, maxValue: T): NDArray = super.clip(x, minValue, maxValue)

  /**
    * Element-wise inequality between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  override def notEquals(x: NDArray, y: NDArray): Boolean = super.notEquals(x, y)

  /**
    * Element-wise equality between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  override def equals(x: NDArray, y: NDArray): Boolean = super.equals(x, y)

  /**
    * Element-wise truth value of (x < y).
    *
    * @param x
    * @param y
    * @return
    */
  override def lt(x: NDArray, y: NDArray): Boolean = super.lt(x, y)

  /**
    * Element-wise truth value of (x <= y).
    *
    * @param x
    * @param y
    * @return
    */
  override def lte(x: NDArray, y: NDArray): Boolean = super.lte(x, y)

  /**
    * Element-wise truth value of (x > y).
    *
    * @param x
    * @param y
    * @return
    */
  override def gt(x: NDArray, y: NDArray): Boolean = super.gt(x, y)

  /**
    * Element-wise truth value of (x >= y).
    *
    * @param x
    * @param y
    * @return
    */
  override def gte(x: NDArray, y: NDArray): Boolean = super.gte(x, y)

  /**
    * Element-wise minimum between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  override def minimum(x: NDArray, y: NDArray): Boolean = super.minimum(x, y)

  /**
    * Element-wise maximum between two tensors.
    *
    * @param x
    * @param y
    * @return
    */
  override def maximum(x: NDArray, y: NDArray): Boolean = super.maximum(x, y)
}

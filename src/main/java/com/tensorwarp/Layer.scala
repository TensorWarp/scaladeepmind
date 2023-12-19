package com.tensorwarp

import com.tensorwarp.Dim

case class Layer(
  name: String,
  datasetName: String,
  kind: Layer.Kind,
  attributes: Int,
  dimensions: Int,
  dimX: Int,
  dimY: Int,
  dimZ: Int
) {
  def getDim: Dim = Dim(dimensions, dimX, dimY, dimZ, 0)
}

object Layer {
  sealed trait Kind
  object Kind {
    case object Input extends Kind
    case object Hidden extends Kind
    case object Output extends Kind
    case object Target extends Kind
  }

  object Attribute {
    val None = 0x0
    val Sparse = 0x1
    val Denoising = 0x2
    val BatchNormalization = 0x4
  }
}

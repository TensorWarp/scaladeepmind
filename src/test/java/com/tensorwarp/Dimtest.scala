package com.tensorwarp

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DimTest extends AnyFlatSpec with Matchers {

  "Dim._1d" should "create a 1-dimensional Dim with the correct properties" in {
    val oneD = Dim._1d(128, 32)
    oneD.dimensions shouldEqual 1
    oneD.stride shouldEqual 128
  }

  "Dim._2d" should "create a 2-dimensional Dim with the correct properties" in {
    val twoD = Dim._2d(128, 64, 32)
    twoD.dimensions shouldEqual 2
    twoD.stride shouldEqual 128 * 64
  }

  "Dim._3d" should "create a 3-dimensional Dim with the correct properties" in {
    val threeD = Dim._3d(128, 64, 32, 16)
    threeD.dimensions shouldEqual 3
    threeD.stride shouldEqual 128 * 64 * 32
  }
}

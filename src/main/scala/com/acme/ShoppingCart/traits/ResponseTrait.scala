package com.acme.ShoppingCart.traits

import com.acme.ShoppingCart.exception.{BadRequestException, UnauthorizedException}
import com.acme.ShoppingCart.dao.UsersDAO
import com.twitter.finatra.Request

trait ResponseTrait {
  def mapCreateResponse(id: Int, userId: Int, productId: Int) =
    Map(
      "id" -> id,
      "userId" -> userId,
      "productId" -> productId,
      "quantity" -> 1,
      "links" -> Map(
        "rel" -> "self",
        "href" -> ("/api/cart/products/" ++ productId.toString)
      ))
}
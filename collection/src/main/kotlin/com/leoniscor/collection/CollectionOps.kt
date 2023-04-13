package com.leoniscor.collection

/**
 * @author gaosong
 */
class CollectionOps {
}

fun useNonNullSafeCollection(stringList: List<String>?) {

    stringList?.stream()?.toList()

}
package extensions

import extensions.wu.seal.PropertyPrefixSupport
import extensions.wu.seal.PropertySuffixSupport
import extensions.wu.seal.AllUpperCase

/**
 * extension collect, all extensions will be hold by this class's extensions property
 */
object ExtensionsCollector {
    /**
     * all extensions
     */
    val extensions = listOf(
            PropertyPrefixSupport,
            PropertySuffixSupport,
            AllUpperCase
    )
}

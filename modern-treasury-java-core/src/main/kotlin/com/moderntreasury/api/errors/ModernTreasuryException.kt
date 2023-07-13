package com.moderntreasury.api.errors

open class ModernTreasuryException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)

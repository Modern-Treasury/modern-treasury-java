package com.moderntreasury.api.errors

class ModernTreasuryIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    ModernTreasuryException(message, cause)

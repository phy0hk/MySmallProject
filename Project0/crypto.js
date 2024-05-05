function sha256(password){
    const utf8 = new TextEncoder().encode(password);
	return crypto.subtle.digest('SHA-256', utf8).then((hashBuffer) => {
	const hashArray = Array.from(new Uint8Array(hashBuffer));
	const hashHex = hashArray
	.map((bytes) => bytes.toString(16).padStart(2, '0'))
	.join('');
	return hashHex;
	});
}
function sha512(password){
    const utf8 = new TextEncoder().encode(password);
	return crypto.subtle.digest('SHA-512', utf8).then((hashBuffer) => {
	const hashArray = Array.from(new Uint8Array(hashBuffer));
	const hashHex = hashArray
	.map((bytes) => bytes.toString(16).padStart(2, '0'))
	.join('');
	return hashHex;
	});
}
function sha1(password){
    const utf8 = new TextEncoder().encode(password);
	return crypto.subtle.digest('SHA-1', utf8).then((hashBuffer) => {
	const hashArray = Array.from(new Uint8Array(hashBuffer));
	const hashHex = hashArray
	.map((bytes) => bytes.toString(16).padStart(2, '0'))
	.join('');
	return hashHex;
	});
}
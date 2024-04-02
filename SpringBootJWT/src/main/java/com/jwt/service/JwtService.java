package com.jwt.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class JwtService  
{
	public static final String secret="Devyani";
	public String generateToken(String userName)
	{
		Map<String,Object> claims = new HashMap<>();
		return createToken(claims,userName);
	}
	private String createToken(Map<String, Object> claims, String userName) {
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(userName)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.signWith(getSignKey(),SignatureAlgorithm.HS256).compact();
	}
	private Key getSignKey() 
	{
		byte[] keyBytes=Decoders.BASE64.decode(secret);
		return Keys.hmacShaKeyFor(keyBytes);
	}
	public String extractUsername(String token) {

		 return extractClaim(token, Claims::getSubject);

		 }

		 public Date extractExpiration(String token) {

		 return extractClaim(token, Claims::getExpiration);

		 }

		 public <T> T extractClaim(String token, Function<Claims, T>

		claimsResolver) {

		 final Claims claims = extractAllClaims(token);

		 return claimsResolver.apply(claims);

		 }
}

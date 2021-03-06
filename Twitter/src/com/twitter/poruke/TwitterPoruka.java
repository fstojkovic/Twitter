
package com.twitter.poruke;

/**
 * Ova klasa implementira ime korisnika i njegovu poruku
 * 
 * @author Filip Stojkovic
 * @version 1.0
 */
public class TwitterPoruka {
	/**
	 * Ime korisnika tipa string
	 */
	private String korisnik;
	/**
	 * Poruka korisnika tipa string
	 */
	private String poruka;

	/**
	 * Metoda vraca ime korisnika
	 * 
	 * @return ime korisnika
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * Metoda postavlja novu vrednost za atribut korisnik
	 * 
	 * @param korisnik
	 *            ime korisnika
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je unet ime:
	 *             <ul>
	 *             <li>null</li>
	 *             <li>prazan string</li>
	 *             </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * Metoda vraca poruku korisnika
	 * 
	 * @return poruku korisnika
	 */
	public String getPoruka() {
		return poruka;
	}

	/**
	 * Metoda postavlja novu vrednost za atribut poruka
	 * 
	 * @param poruka
	 * 
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je uneta poruka:
	 *             <ul>
	 *             <li>null</li>
	 *             <li>duzine vece od 140 karaktera</li>
	 *             </ul>
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * 
	 * Metoda vraca string sa podacima o korisniku i njegovoj poruku
	 * 
	 * @return Ime korisnika i njegovu poruku
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((korisnik == null) ? 0 : korisnik.hashCode());
		result = prime * result + ((poruka == null) ? 0 : poruka.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TwitterPoruka other = (TwitterPoruka) obj;
		if (korisnik == null) {
			if (other.korisnik != null)
				return false;
		} else if (!korisnik.equals(other.korisnik))
			return false;
		if (poruka == null) {
			if (other.poruka != null)
				return false;
		} else if (!poruka.equals(other.poruka))
			return false;
		return true;
	}

}

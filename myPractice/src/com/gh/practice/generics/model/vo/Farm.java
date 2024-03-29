package com.gh.practice.generics.model.vo;

public class Farm {
	
	private String kind;
	
	public Farm() {}
	public Farm(String kind) {
//		setKind(kind);
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return kind;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} 
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Farm other = (Farm)obj;
		
		if (kind == null) {
			if (other.kind != null) {
				return false;
			}
		} else if (!kind.equals(other.kind)) {
			return false;
		}

		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = result * PRIME + (kind == null ? 0 : kind.hashCode());
		return result;
	}
}

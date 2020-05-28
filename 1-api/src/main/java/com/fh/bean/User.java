package com.fh.bean;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 5646654469547836854L;
	private Integer id;
		private String name;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}

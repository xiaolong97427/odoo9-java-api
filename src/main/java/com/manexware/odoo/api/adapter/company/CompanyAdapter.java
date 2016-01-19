package com.manexware.odoo.api.adapter.company;

import com.manexware.odoo.api.adapter.EntityAdapter;
import com.manexware.odoo.api.core.EntityParams;
import com.manexware.odoo.api.core.FilterCollection;
import com.manexware.odoo.api.core.OdooAdapter;
import com.manexware.odoo.api.core.Row;
import com.manexware.odoo.api.entity.core.Company;

public class CompanyAdapter extends EntityAdapter<Company> {

	public CompanyAdapter(OdooAdapter odooAdapter) {
		super(odooAdapter);
	}

	@Override
	protected String getKey() {
		return "res.company";
	}

	@Override
	protected EntityParams buildEntityParameters(Company entity) {
		throw new RuntimeException("Not suppoerted yet.");
	}

	@Override
	protected String[] buildFieldsList() {
		return new String[]{"name"};
	}
	
	public Company findbyName(String name){
		FilterCollection nameFilter = new FilterCollection();
		nameFilter.add("name", "=", name);
		
		return this.findOne(nameFilter);
	}

	@Override
	protected Company transcodeRowToEntity(Row row) {
		return new Company(row.getID(), (String)row.get("name"));
	}
}

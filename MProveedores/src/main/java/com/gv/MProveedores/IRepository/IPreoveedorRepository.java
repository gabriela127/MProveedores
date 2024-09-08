package com.gv.MProveedores.IRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gv.MProveedores.Entity.Proveedor;

@Repository
public interface IPreoveedorRepository extends CrudRepository<Proveedor, Long>{

}

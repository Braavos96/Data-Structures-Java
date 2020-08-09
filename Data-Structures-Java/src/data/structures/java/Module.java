package data.structures.java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Braavos
 */
public class Module {

    private String moduleID, moduleName;

    public Module(String moduleID, String moduleName) {
        this.moduleID = moduleID;
        this.moduleName = moduleName;
    }

    /**
     * Retrieves the Module's ID
     *
     * @pre true
     * @return the Module's ID
     */
    public String getModuleID() {
        return this.moduleID;
    }

    /**
     * Retrieves the name of the Module
     *
     * @pre true
     * @return the name of the Module
     */
    public String getModuleName() {
        return this.moduleName;
    }

}

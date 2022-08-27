package io.github.project.openubl.quarkus.xbuilder.deployment;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = {
        io.github.project.openubl.xbuilder.content.models.common.Cliente.class,
        io.github.project.openubl.xbuilder.content.models.common.Proveedor.class,
        io.github.project.openubl.xbuilder.content.models.common.Contacto.class,
        io.github.project.openubl.xbuilder.content.models.common.Firmante.class,
        io.github.project.openubl.xbuilder.content.models.common.Direccion.class,
        io.github.project.openubl.xbuilder.content.models.common.Cliente.ClienteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.common.Contacto.ContactoBuilder.class,
        io.github.project.openubl.xbuilder.content.models.common.Firmante.FirmanteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.common.Proveedor.ProveedorBuilder.class,
        io.github.project.openubl.xbuilder.content.models.common.Direccion.DireccionBuilder.class,

        io.github.project.openubl.xbuilder.content.models.standard.general.Note.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.DebitNote.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.CreditNote.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Document.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Invoice.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Note.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporte.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporteNote.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporteInvoice.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.DebitNote.DebitNoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.CreditNote.CreditNoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.CargoDescuento.CargoDescuentoBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Invoice.InvoiceBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Note.NoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.CreditNote.CreditNoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.DebitNote.DebitNoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.FormaDePago.FormaDePagoBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporteNote.TotalImporteNoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporte.TotalImporteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporteNote.TotalImporteNoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporteInvoice.TotalImporteInvoiceBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Document.DocumentBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Invoice.InvoiceBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.Note.NoteBuilder.class,
        io.github.project.openubl.xbuilder.content.models.standard.general.TotalImporteInvoice.TotalImporteInvoiceBuilder.class,
})
public class XBuilderReflectionConfig {
}
